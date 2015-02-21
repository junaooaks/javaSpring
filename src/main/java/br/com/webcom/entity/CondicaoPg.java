package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="condicaopg")
public class CondicaoPg implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2003936019886390251L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long meiopgId;
	private Long operacaoId;
	@Size(max=3)
	private String entrada;
	@Size(max=50)
	private String descricao;
	@Size(max=50)
	private String numeroParcela;
	@Size(max=50)
	private String intervalorDias;
	@Size(max=50)
	private String desconto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMeiopgId() {
		return meiopgId;
	}
	public void setMeiopgId(Long meiopgId) {
		this.meiopgId = meiopgId;
	}
	public Long getOperacaoId() {
		return operacaoId;
	}
	public void setOperacaoId(Long operacaoId) {
		this.operacaoId = operacaoId;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNumeroParcela() {
		return numeroParcela;
	}
	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}
	public String getIntervalorDias() {
		return intervalorDias;
	}
	public void setIntervalorDias(String intervalorDias) {
		this.intervalorDias = intervalorDias;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
