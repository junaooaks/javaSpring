package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fornecedor implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2277086699120309664L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String tipoPessoa;
	private String cpfCnpj;
	private String identidadeInscricao;
	private String descricao;
	private String apelidoFantasia;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String telefone1;
	private String telefone2;
	private String telefone3;
	private String telefone4;
	private String email;
	private String website;
	private String banco;
	private String agencia;
	private String conta;
	private String obs1;
	private String obs2;
	private String obs3;
	

}
