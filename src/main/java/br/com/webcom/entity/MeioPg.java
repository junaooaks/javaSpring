package br.com.webcom.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
public class MeioPg implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2277086699120309669L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private String lancamentoCaixa;
	private String lancamentoContasAReceber;
	
}
