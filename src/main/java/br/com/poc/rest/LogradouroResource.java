package br.com.poc.rest;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.poc.entity.Logradouro;
import br.com.poc.entity.ObjectPaginated;
import br.com.poc.service.LogradouroService;

@Path("/logradouro")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LogradouroResource {

	@Inject
	private LogradouroService service;

	@GET
	public List<Logradouro> getLogradouros() {
		List<Logradouro> lista =  service.createLogradouros();
		return service.findAll();
	}

	@GET
	@Path("page/{number}/{size}")
	public ObjectPaginated<Logradouro, Serializable> getAllLogradouros(@PathParam("number") int pageNumber,
			@PathParam("size") int pageSize) {
		ObjectPaginated<Logradouro, Serializable> o = new ObjectPaginated<>(pageNumber, pageSize,
				service.findPaginated(pageNumber, pageSize));
		return o;
	}

	@GET
	@Path("{id}")
	public Response getLogradouroById(@PathParam("id") int id) {
		Logradouro logradouro = service.findLogradouroById(id);
		if (logradouro != null) {
			return Response.ok(logradouro).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).entity(id).build();
		}
	}

	@POST
	public Response saveLogradouro(Logradouro logradouro) {
		logradouro.setCep(10);
		return Response.status(Response.Status.ACCEPTED).entity(logradouro).build();
	}

	@PUT
	public Response updateLogradouro(Logradouro logradouro) {
		if (logradouro.getCep() != null) {
			return Response.ok().build();
		} else {
			return Response.status(Response.Status.BAD_REQUEST).entity(logradouro).build();
		}
	}

}
