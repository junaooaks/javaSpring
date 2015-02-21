package br.com.webcom.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
public class MovimentoCaixa implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2277086699120309664L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long pessoaId;
	private Long caixaId;
	private Long meiopgId;
	@Temporal(TemporalType.DATE)
	private Date data;
	private String descricao;
	private String documento;
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal valor;
	private String status;
	
}
