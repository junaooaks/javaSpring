package br.com.webcom.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDAO<PK extends Serializable, T extends Serializable> {
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
		
	}

	public T getById(PK pk) {
		return (T) getCurrentSession().get(getTypeClass(), pk);
	}

	public void save(T entity) {
		getCurrentSession().persist(entity);
	}

	public void update(T entity) {
		getCurrentSession().merge(entity);
	}

	public void delete(T entity) {
		getCurrentSession().delete(entity);
	}

	public List<T> findAll() {
		return getCurrentSession().createQuery(
				("FROM " + getTypeClass().getName())).list();
	}

	protected Class<?> getTypeClass() {
		Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
		return clazz;
	}
}
