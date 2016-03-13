package br.com.poc.dao.core;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import br.com.poc.factory.PersistenceFactory;

public abstract class GenericDAO<T, I extends Serializable> implements IGenericDAO<T, Serializable> {

	@Inject
	private PersistenceFactory pf;

	@Override
	@Transactional
	public T save(T entity) {
		// TODO Auto-generated method stub
		T saved = null;
		saved = getEntityManager().merge(entity);

		return saved;
	}

	@Override
	@Transactional
	public void remove(T entity) {
		// TODO Auto-generated method stub
		getEntityManager().remove(entity);
	}

	@Override
	public T getById(Class<T> classe, Serializable pk) {
		// TODO Auto-generated method stub
		try {
			return getEntityManager().find(classe, pk);
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public List<T> getAll(Class<T> classe) {
		// TODO Auto-generated method stub
		CriteriaBuilder cb = this.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(classe);
		Root<T> root = cq.from(classe);
		cq.select(root);
		TypedQuery<T> q = this.getEntityManager().createQuery(cq);
		return q.getResultList();
	}

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return pf.get();
	}

}
