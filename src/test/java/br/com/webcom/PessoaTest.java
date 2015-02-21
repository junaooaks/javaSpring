package br.com.webcom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.webcom.entity.Pessoa;
import br.com.webcom.service.PessoaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class PessoaTest {

	@Autowired
	private PessoaService pessoaService;

	@Test
	public void crudTest() {
		Pessoa pessoa = new Pessoa();
		Long pessoaId;

		pessoa.setNome("Teste");
		//pessoa.setCpf("111.111.111.11");
		pessoa.setDataNascimento(new Date());

		pessoaService.savePessoa(pessoa);
		pessoaId = pessoa.getId();

		assertNotNull(pessoaId);

		List<Pessoa> findAll = pessoaService.findAll();

		assertTrue(findAll.size() > 0);

		pessoa = pessoaService.getById(pessoaId);
		pessoa.setNome("Test");
		//pessoa.setCpf("222.222.222-22");

		pessoaService.updatePessoa(pessoa);

		pessoa = pessoaService.getById(pessoaId);

		assertEquals("Test", pessoa.getNome());
		//assertEquals("222.222.222-22", pessoa.getCpf());

		pessoaService.deletePessoa(pessoa);

		pessoa = pessoaService.getById(pessoaId);
		assertNull(pessoa);
	}

	@Test
	public void findByNameTest() {

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Teste");
		//pessoa.setCpf("111.111.111.11");
		pessoa.setDataNascimento(new Date());

		pessoaService.savePessoa(pessoa);

		List<Pessoa> pessoas = pessoaService.findByName("Teste");

		assertTrue(pessoas.size() > 0);
		
		//pessoaService.deletePessoa(pessoa);
	}
}
