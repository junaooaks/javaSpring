package br.com.webcom.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name="contagem_estoque")
public class ContagemEstoque implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2129220572034579977L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	private Long situacao;
	@Size(max=200)
	private String obs1;
	@Size(max=200)
	private String obs2;
	@Size(max=200)
	private String obs3;
	
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
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Long getSituacao() {
		return situacao;
	}
	public void setSituacao(Long situacao) {
		this.situacao = situacao;
	}
	public String getObs1() {
		return obs1;
	}
	public void setObs1(String obs1) {
		this.obs1 = obs1;
	}
	public String getObs2() {
		return obs2;
	}
	public void setObs2(String obs2) {
		this.obs2 = obs2;
	}
	public String getObs3() {
		return obs3;
	}
	public void setObs3(String obs3) {
		this.obs3 = obs3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
