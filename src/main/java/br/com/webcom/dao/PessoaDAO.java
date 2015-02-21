package br.com.webcom.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.webcom.entity.Pessoa;

@Repository(value="pessoaDAO")
public class PessoaDAO extends GenericDAO<Long, Pessoa>{

	@SuppressWarnings("unchecked")
	public List<Pessoa> findByName(String nome) {
		Criteria criteria = getCurrentSession().createCriteria(getTypeClass());
		
		criteria.add(Restrictions.like("nome", "%"+nome+"%"));
		return criteria.list();
	}

}
