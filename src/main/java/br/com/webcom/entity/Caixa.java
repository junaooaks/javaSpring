package br.com.webcom.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="caixa")
public class Caixa implements Serializable{
	
	/**
	 *@author junior oaks 
	 */
	private static final long serialVersionUID = 3707300031002892831L;
	
	@Id
	@GeneratedValue
	private Long id;
	@Size(max=100)
	private String descricao;
	private Long   situacao;
	@Temporal(TemporalType.DATE)
	private Date  data;
	@NotNull
	@Size(max=100)
	private String senha;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getSituacao() {
		return situacao;
	}
	public void setSituacao(Long situacao) {
		this.situacao = situacao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
