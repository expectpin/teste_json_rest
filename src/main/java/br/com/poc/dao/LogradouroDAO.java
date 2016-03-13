package br.com.poc.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.poc.dao.core.GenericDAO;
import br.com.poc.entity.Logradouro;

public class LogradouroDAO extends GenericDAO<Logradouro, Serializable> implements ILogradouroDAO{

	@SuppressWarnings("unchecked")
	@Override
	public List<Logradouro> getPaginated(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		
		Query query = this.getEntityManager().createQuery("From Logradouro");
		query.setFirstResult((pageNumber-1) * pageSize); 
		query.setMaxResults(pageSize);
		
		return query.getResultList();
	}
	
/*	public void paginated(int pageNumber, int pageSize) {
		CriteriaBuilder criteriaBuilder = this.getEntityManager().getCriteriaBuilder();
		 
		CriteriaQuery<Long> countQuery = criteriaBuilder.createQuery(Long.class);
		countQuery.select(criteriaBuilder.count(countQuery.from(Notice.class)));
		Long count = this.getEntityManager().createQuery(countQuery).getSingleResult();
		 
		CriteriaQuery<Notice> criteriaQuery = criteriaBuilder.createQuery(Notice.class);
		Root<Notice> from = criteriaQuery.from(Notice.class);
		CriteriaQuery<Notice> select = criteriaQuery.select(from);
		 
		TypedQuery<Notice> typedQuery = this.getEntityManager().createQuery(select);
		while (pageNumber < count.intValue()) {
		    typedQuery.setFirstResult(pageNumber - 1);
		    typedQuery.setMaxResults(pageSize);
		    System.out.println("Current page: " + typedQuery.getResultList());
		    pageNumber += pageSize;
		}		
	}*/
	
}
