package br.com.poc.dao;

import java.io.Serializable;
import java.util.List;

import br.com.poc.dao.core.IGenericDAO;
import br.com.poc.entity.Logradouro;

public interface ILogradouroDAO extends IGenericDAO<Logradouro, Serializable>{

	public List<Logradouro> getPaginated(int pageNumber, int pageSize);
}
