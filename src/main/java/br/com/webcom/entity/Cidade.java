package br.com.webcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="cidade")
public class Cidade implements Serializable{
	
	
	/**
	 * @author
	 */
	
	private static final long serialVersionUID = -670894000147334195L;
	@Id
	@GeneratedValue
	private Long id;
	private Long codigo;
	private Long ibge;
	private Long municipio;
	private Long codPais;
	@Size(max=100)
	private String estado;
	@Size(max=2)
	private String uf;
	@Size(max=10)
	private String cep;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Long getIbge() {
		return ibge;
	}
	public void setIbge(Long ibge) {
		this.ibge = ibge;
	}
	public Long getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Long municipio) {
		this.municipio = municipio;
	}
	public Long getCodPais() {
		return codPais;
	}
	public void setCodPais(Long codPais) {
		this.codPais = codPais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
