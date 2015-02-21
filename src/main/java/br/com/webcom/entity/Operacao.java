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
public class Operacao implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2277086699120309601L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long condicaoPg;
	private String descricao;
	private String tipo;
	private String movEstoque;
	private String movFinanceiro;
	private String movComissao;
	
}
