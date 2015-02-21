package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6250328235656329111L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String usuario;
	private String senha;
	private String cargo;
	private Long nivelAcesso;
	private String ativo;
	
}
