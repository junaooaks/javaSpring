package br.com.webcom.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.com.webcom.entity.Pessoa;
import br.com.webcom.service.PessoaService;

@Controller
@SessionAttributes(types = Pessoa.class)
public class PessoaController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private PessoaService pessoaService;

	@RequestMapping(value = "/pessoa/listar", method = RequestMethod.GET)
	public String listar(Model model) {

		model.addAttribute("pessoas", pessoaService.findAll());

		return "pessoa/pessoaListar";
	}

	@RequestMapping(value = "/pessoa/novo", method = RequestMethod.GET)
	public String initFormulario(Map<String, Object> model) {
		Pessoa pessoa = new Pessoa();
		model.put("pessoa", pessoa);

		return "pessoa/pessoaForm";
	}

	@RequestMapping(value = "/pessoa/novo", method = RequestMethod.POST)
	public String processCreation(@Valid Pessoa pessoa, BindingResult result,
			SessionStatus status) {
		if (result.hasErrors()) {
			return "pessoa/pessoaForm";
		} else {
			this.pessoaService.savePessoa(pessoa);
			status.setComplete();
			return "redirect:/pessoa/listar";
		}
	}

	@RequestMapping(value = "/pessoa/{pessoaId}/editar", method = RequestMethod.GET)
	public String initUpdateForm(@PathVariable("pessoaId") long pessoaId,
			Model model) {
		Pessoa pessoa = this.pessoaService.getById(pessoaId);
		model.addAttribute(pessoa);
		return "pessoa/pessoaForm";
	}

	@RequestMapping(value = "/pessoa/{pessoaId}/editar", method = RequestMethod.POST)
	public String processUpdate(@Valid Pessoa pessoa, BindingResult result,
			SessionStatus status) {
		if (result.hasErrors()) {
			return "pessoa/pessoaForm";
		} else {
			this.pessoaService.updatePessoa(pessoa);
			status.setComplete();
			return "redirect:/pessoa/listar";
		}
	}

	@RequestMapping(value = "/pessoa/{pessoaId}/deletar", method = RequestMethod.GET)
	public String processDelete(@PathVariable("pessoaId") long pessoaId) {
		Pessoa pessoa = this.pessoaService.getById(pessoaId);
		this.pessoaService.deletePessoa(pessoa);

		return "redirect:/pessoa/listar";

	}

	@RequestMapping(value = "/pessoa/buscar", method = RequestMethod.GET)
	public String buscar(String nome, Model model) {

		model.addAttribute("pessoas", pessoaService.findByName(nome));

		return "pessoa/pessoaListar";
	}

	
	
	@RequestMapping(value = "/pessoa/buscarJsonGET/{nome}", method = RequestMethod.GET)
	public @ResponseBody
	List<Pessoa> buscaJsonGET(@PathVariable String nome) {

		return pessoaService.findByName(nome);
	}

	@RequestMapping(value = "/pessoa/buscarJson", method = RequestMethod.POST)
	public @ResponseBody
	List<Pessoa> buscaJson() {

		return pessoaService.findAll();
	}

	@RequestMapping(value = "/pessoa/buscarJsonPOST", method = RequestMethod.POST, headers="Accept=application/json")
	public @ResponseBody
	List<Pessoa> buscaJsonPOST(@RequestBody Pessoa pessoa) {

		return pessoaService.findByName(pessoa.getNome());
	}

}