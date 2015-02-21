package br.com.webcom.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.webcom.entity.Produto;

@Service
public interface ProdutoService {
	public void saveProduto(Produto Produto);
	public void updateProduto(Produto Produto);
	public void deleteProduto(Produto Produto);
	public List<Produto> findAll();
	public Produto getById(Long id);
	public List<Produto> findByName(String nome);
}
