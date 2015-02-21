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
@Table(name="comissao")
public class Comissao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3149021433105603579L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long vendedorId;
	private Long saidaNfs;
	@Temporal(TemporalType.DATE)
	private Date data;
	@Temporal(TemporalType.DATE)
	private Date dataRecebimento;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal valorBruto;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal valorRecebido;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal fatorComissao;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal valorComissao;
	@Size(max=15)
	private String situacao;
	@Size(max=15)
	private String tipo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVendedorId() {
		return vendedorId;
	}
	public void setVendedorId(Long vendedorId) {
		this.vendedorId = vendedorId;
	}
	public Long getSaidaNfs() {
		return saidaNfs;
	}
	public void setSaidaNfs(Long saidaNfs) {
		this.saidaNfs = saidaNfs;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	public BigDecimal getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}
	public BigDecimal getValorRecebido() {
		return valorRecebido;
	}
	public void setValorRecebido(BigDecimal valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	public BigDecimal getFatorComissao() {
		return fatorComissao;
	}
	public void setFatorComissao(BigDecimal fatorComissao) {
		this.fatorComissao = fatorComissao;
	}
	public BigDecimal getValorComissao() {
		return valorComissao;
	}
	public void setValorComissao(BigDecimal valorComissao) {
		this.valorComissao = valorComissao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
