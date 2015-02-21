package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="chavenfe")
public class ChaveNfe implements Serializable{
	
	/**
	 * @author
	 * 
	 */
	
	private static final long serialVersionUID = 6190816379062550702L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long saidaId;
	private Long pessoaId;
	@Size(max=50)
	private String chave;
	@Size(max=100)
	private String msg;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSaidaId() {
		return saidaId;
	}
	public void setSaidaId(Long saidaId) {
		this.saidaId = saidaId;
	}
	public Long getPessoaId() {
		return pessoaId;
	}
	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
