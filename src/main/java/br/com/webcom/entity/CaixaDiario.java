package br.com.webcom.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
@Table(name="caixadiario")
public class CaixaDiario implements Serializable{

	/**
	 *@author
	 */
	private static final long serialVersionUID = -2557373195699408888L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long usuarioId;
	private Long caixaId;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal abertoPdv;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal sangria;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal suprimento;
	@Column(columnDefinition="TEXT")
	private String descricao;
	@Size(max=50)
	private String situacao;
	@Temporal(TemporalType.DATE)
	private Date dataAbertura;
	@Temporal(TemporalType.DATE)
	private Date dataFechamento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Long getCaixaId() {
		return caixaId;
	}
	public void setCaixaId(Long caixaId) {
		this.caixaId = caixaId;
	}
	public BigDecimal getAbertoPdv() {
		return abertoPdv;
	}
	public void setAbertoPdv(BigDecimal abertoPdv) {
		this.abertoPdv = abertoPdv;
	}
	public BigDecimal getSangria() {
		return sangria;
	}
	public void setSangria(BigDecimal sangria) {
		this.sangria = sangria;
	}
	public BigDecimal getSuprimento() {
		return suprimento;
	}
	public void setSuprimento(BigDecimal suprimento) {
		this.suprimento = suprimento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
