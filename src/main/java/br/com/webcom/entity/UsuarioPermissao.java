package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UsuarioPermissao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6250328235656329110L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long usuarioId;
	private Long subMenuId;
	private String nivelPermissao;
	
}
