package br.com.poc.service;

import java.util.List;

import javax.inject.Inject;

import br.com.poc.dao.ILogradouroDAO;
import br.com.poc.entity.Logradouro;

public class LogradouroService {

	@Inject
	private ILogradouroDAO logradouroDAO;

	public List<Logradouro> findAll() {
		return logradouroDAO.getAll(Logradouro.class);
	}

	public Logradouro findLogradouroById(int id) {
		return logradouroDAO.getById(Logradouro.class, id);
	}

	public List<Logradouro> findPaginated(int pageNumber, int pageSize) {
		return logradouroDAO.getPaginated(pageNumber, pageSize);
	}
	
	public List<Logradouro> createLogradouros() {
		for (int i = 0; i < 20; i++) {
			Logradouro logradouro = new Logradouro();
			logradouro.setCep(76873274 + i);
			logradouro.setTipoDeLogradouro("Rua");
			logradouro.setLogradouro("Juriti");
			logradouro.setBairro("Setor 02");
			logradouro.setCidade("Ariquemes");
			logradouro.setEstado("RO");
			
			logradouroDAO.save(logradouro);
		}

		return findAll();
	}
}
