package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contasreceber_movimentocaixa")
public class ContasReceberMovimentoCaixa implements Serializable{
	
	private static final long serialVersionUID = -924326482282634121L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long contasReceberId;
	private Long movimentoCaixaId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getContasReceberId() {
		return contasReceberId;
	}
	public void setContasReceberId(Long contasReceberId) {
		this.contasReceberId = contasReceberId;
	}
	public Long getMovimentoCaixaId() {
		return movimentoCaixaId;
	}
	public void setMovimentoCaixaId(Long movimentoCaixaId) {
		this.movimentoCaixaId = movimentoCaixaId;
	}
	
	
	
}
