package br.com.webcom.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webcom.dao.ProdutoDAO;
import br.com.webcom.entity.Produto;
import br.com.webcom.service.ProdutoService;

@Service
@org.springframework.transaction.annotation.Transactional
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@Override
	public void saveProduto(Produto produto) {
		produtoDAO.save(produto);
		
	}

	@Override
	public void updateProduto(Produto produto) {
		produtoDAO.update(produto);
		
	}

	@Override
	public void deleteProduto(Produto produto) {
		produtoDAO.delete(produto);
		
	}

	@Override
	@Transactional
	public List<Produto> findAll() {
		return produtoDAO.findAll();
	}

	@Override
	public Produto getById(Long id) {
		return produtoDAO.getById(id);
	}

	@Override
	public List<Produto> findByName(String nome) {
		return produtoDAO.findByName(nome);
	}

}
