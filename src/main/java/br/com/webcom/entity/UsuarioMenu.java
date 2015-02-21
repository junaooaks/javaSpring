package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UsuarioMenu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6250328235656329109L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long menuId;
	private Long usuario_ID;
	
}
