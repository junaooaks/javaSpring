package br.com.webcom.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.webcom.entity.Pessoa;

@Service
public interface PessoaService {
	public void savePessoa(Pessoa Pessoa);
	public void updatePessoa(Pessoa Pessoa);
	public void deletePessoa(Pessoa Pessoa);
	public List<Pessoa> findAll();
	public Pessoa getById(Long id);
	public List<Pessoa> findByName(String nome);
}
