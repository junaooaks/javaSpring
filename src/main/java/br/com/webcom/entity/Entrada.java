package br.com.webcom.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
@Table(name="entrada")
public class Entrada implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8493399209852145863L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long operacaoId;
	private Long fornecedorId;
	private Long numeroNf;
	private Long cfop;
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	@Temporal(TemporalType.DATE)
	private Date dataEntrada;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal totalProdutos;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal totalIpi;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal totalSt;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal totalIcms;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal totalFrete;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal totalNf;
	@Size(max=100)
	private String status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOperacaoId() {
		return operacaoId;
	}
	public void setOperacaoId(Long operacaoId) {
		this.operacaoId = operacaoId;
	}
	public Long getFornecedorId() {
		return fornecedorId;
	}
	public void setFornecedorId(Long fornecedorId) {
		this.fornecedorId = fornecedorId;
	}
	public Long getNumeroNf() {
		return numeroNf;
	}
	public void setNumeroNf(Long numeroNf) {
		this.numeroNf = numeroNf;
	}
	public Long getCfop() {
		return cfop;
	}
	public void setCfop(Long cfop) {
		this.cfop = cfop;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public BigDecimal getTotalProdutos() {
		return totalProdutos;
	}
	public void setTotalProdutos(BigDecimal totalProdutos) {
		this.totalProdutos = totalProdutos;
	}
	public BigDecimal getTotalIpi() {
		return totalIpi;
	}
	public void setTotalIpi(BigDecimal totalIpi) {
		this.totalIpi = totalIpi;
	}
	public BigDecimal getTotalSt() {
		return totalSt;
	}
	public void setTotalSt(BigDecimal totalSt) {
		this.totalSt = totalSt;
	}
	public BigDecimal getTotalIcms() {
		return totalIcms;
	}
	public void setTotalIcms(BigDecimal totalIcms) {
		this.totalIcms = totalIcms;
	}
	public BigDecimal getTotalFrete() {
		return totalFrete;
	}
	public void setTotalFrete(BigDecimal totalFrete) {
		this.totalFrete = totalFrete;
	}
	public BigDecimal getTotalNf() {
		return totalNf;
	}
	public void setTotalNf(BigDecimal totalNf) {
		this.totalNf = totalNf;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
