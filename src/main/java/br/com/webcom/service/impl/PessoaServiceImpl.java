package br.com.webcom.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webcom.dao.PessoaDAO;
import br.com.webcom.entity.Pessoa;
import br.com.webcom.service.PessoaService;

@Service
@org.springframework.transaction.annotation.Transactional
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaDAO pessoaDAO;
	
	@Override
	public void savePessoa(Pessoa pessoa) {
		pessoaDAO.save(pessoa);
		
	}

	@Override
	public void updatePessoa(Pessoa pessoa) {
		pessoaDAO.update(pessoa);
		
	}

	@Override
	public void deletePessoa(Pessoa pessoa) {
		pessoaDAO.delete(pessoa);
		
	}

	@Override
	@Transactional
	public List<Pessoa> findAll() {
		return pessoaDAO.findAll();
	}

	@Override
	public Pessoa getById(Long id) {
		return pessoaDAO.getById(id);
	}

	@Override
	public List<Pessoa> findByName(String nome) {
		return pessoaDAO.findByName(nome);
	}

}
