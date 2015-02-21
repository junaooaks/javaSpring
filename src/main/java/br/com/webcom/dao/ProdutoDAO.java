package br.com.webcom.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.webcom.entity.Produto;

@Repository(value="produtoDAO")
public class ProdutoDAO extends GenericDAO<Long, Produto> {
	
	@SuppressWarnings("unchecked")
	public List<Produto> findByName(String nome) {
		Criteria criteria = getCurrentSession().createCriteria(getTypeClass());
		
		criteria.add(Restrictions.like("produto", "%"+nome+"%"));
		return criteria.list();
	}

}
