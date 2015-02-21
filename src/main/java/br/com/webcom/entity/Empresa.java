package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="empresa")
public class Empresa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3846505897542801670L;
	
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	@Size(max=20)
	private String cpfCnpj;
	@Size(max=30)
	private String ie;
	@Size(max=100)
	private String descricao;
	@Size(max=100)
	private String apelidoFantasia;
	@Size(max=150)
	private String endereco;
	@Size(max=10)
	private String numero;
	@Size(max=100)
	private String complemento;
	@Size(max=150)
	private String bairro;
	@Size(max=100)
	private String cidade;
	@Size(max=20)
	private String cep;
	@Size(max=20)
	private String estado;
	@Size(max=20)
	private String banco;
	@Size(max=20)
	private String agencia;
	@Size(max=20)
	private String conta;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getApelidoFantasia() {
		return apelidoFantasia;
	}
	public void setApelidoFantasia(String apelidoFantasia) {
		this.apelidoFantasia = apelidoFantasia;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	
}
