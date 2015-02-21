package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="agenda")
public class Agenda implements Serializable{
	
	/**
	 *@author
	 */
	private static final long serialVersionUID = -8521159098360964487L;
	
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	@Size(max=200)
	private String nome;
	@Size(max=20)
	private String telefone1;
	@Size(max=20)
	private String telefone2;
	@Size(max=20)
	private String telefone3;
	@Size(max=20)
	private String telefone4;
	@Email
	@Size(max=200)
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getTelefone3() {
		return telefone3;
	}
	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}
	public String getTelefone4() {
		return telefone4;
	}
	public void setTelefone4(String telefone4) {
		this.telefone4 = telefone4;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
