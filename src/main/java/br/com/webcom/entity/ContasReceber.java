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
@Table(name="contasareceber")
public class ContasReceber implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1891798362750031251L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long saidaId;
	private Long pessoaId;
	private Long vendedorId;
	private Long meiopgId;
	private Long caixaId;
	@Size(max=100)
	private String documento;
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	@Temporal(TemporalType.DATE)
	private Date dataRecebimento;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal valorOriginal;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal valorPago;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal desconto;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal juros;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal fatorComissao;
	@Size(max=15)
	private String situacao;
	
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
	public Long getVendedorId() {
		return vendedorId;
	}
	public void setVendedorId(Long vendedorId) {
		this.vendedorId = vendedorId;
	}
	public Long getMeiopgId() {
		return meiopgId;
	}
	public void setMeiopgId(Long meiopgId) {
		this.meiopgId = meiopgId;
	}
	public Long getCaixaId() {
		return caixaId;
	}
	public void setCaixaId(Long caixaId) {
		this.caixaId = caixaId;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	public BigDecimal getValorOriginal() {
		return valorOriginal;
	}
	public void setValorOriginal(BigDecimal valorOriginal) {
		this.valorOriginal = valorOriginal;
	}
	public BigDecimal getValorPago() {
		return valorPago;
	}
	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}
	public BigDecimal getDesconto() {
		return desconto;
	}
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	public BigDecimal getJuros() {
		return juros;
	}
	public void setJuros(BigDecimal juros) {
		this.juros = juros;
	}
	public BigDecimal getFatorComissao() {
		return fatorComissao;
	}
	public void setFatorComissao(BigDecimal fatorComissao) {
		this.fatorComissao = fatorComissao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
}
