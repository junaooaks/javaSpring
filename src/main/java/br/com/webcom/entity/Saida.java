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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
public class Saida implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6250328235656329106L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long nfs;
	private Long pessoaId;
	private Long vendedorId;
	private Long operacaoId;
	private String operacao;
	private Long condicaoPgId;
	@Temporal(TemporalType.DATE)
	private Date   dataEmissao;
	@Temporal(TemporalType.DATE)
	private Date dataSaida;
	@Temporal(TemporalType.DATE)
	private Date dataUpdate;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal valorBruto;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal desconto;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal frete;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal valorLiquido;
	private String situacao;
	
}
