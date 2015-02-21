package br.com.webcom.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.webcom.entity.Pessoa;
import br.com.webcom.entity.Produto;
import br.com.webcom.service.ProdutoService;

@Controller
@SessionAttributes(types = Produto.class)
public class ProdutoController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/produto/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		
		model.addAttribute("produto", produtoService.findAll());

		return "produto/produtoListar";

	}
	@RequestMapping(value = "/produto/novo", method = RequestMethod.GET)
	public String initFormulario(Map<String, Object> model) {
		Produto produto = new Produto();
		model.put("produto", produto);

		return "produto/produtoForm";
	}

}
