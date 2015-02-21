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
@Table(name="pessoa")
public class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6250328235656329195L;
	
	@Id
	@GeneratedValue
	private Long   id;
	@Size(max=5)
	private String situacao;
	@Size(max=100)
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date   dataNascimento;
	@Size(max=18, min=11)
	private String cpfCnpj;
	@Size(max=20)
	private String identidadeInscricao;
	@Size(max=5)
	private String sexo;
	@Size(max=200)
	private String apelidoFantasia;
	@Email
	@Size(max=150)
	private String email;
	@Size(max=20)
	private String telefoneComercial;
	@Size(max=20)
	private String telefoneResidencial;
	@Size(max=20)
	private String celular1;
	@Size(max=20)
	private String celular2;
	@NotNull
	@Size(max=100)
	private String cidade;
	@Size(max=5)
	private String estado;
	@NotNull
	@Size(max=15)
	private String cep;
	@NotNull
	@Size(max=200)
	private String endereco;
	@NotNull
	@Size(max=150)
	private String bairro;
	@NotNull
	@Size(max=10)
	private String numero;
	@Size(max=150)
	private String complemento;
	@Size(max=200)
	private String filiacao;
	@Size(max=20)
	private String estadoCivil;
	@Size(max=150)
	private String profissao;
	@Size(max=150)
	private String empresa;
	@Size(max=5)
	private String ativo;
	@Size(max=250)
	private String obs1;
	@Size(max=250)
	private String obs2;
	@Size(max=250)
	private String obs3;
	
	@Temporal(TemporalType.DATE)
	private Date dataUpdate;
	@Temporal(TemporalType.DATE)
	private Date dataInsert;
	
	
	@Temporal(TemporalType.DATE)
	private Date dataAvaliacao;
	@Size(max=100)
	private String avaliador;
	@Temporal(TemporalType.DATE)
	private Date vencAvaliacao;
	@Size(max=200)
	private String consultaSPC;
	@Size(max=200)
	private String consultaSerasa;
	@Size(max=200)
	private String consultaOutros;
	@Size(max=200)
	private String refCom1;
	@Size(max=100)
	private String numCompras1;
	@Size(max=100)
	private String ultCompra1;
	@Size(max=100)
	private String maiorCompra1;
	@Size(max=100)
	private String maiorAtraso1;
	@Size(max=200)
	private String refCom2;
	@Size(max=100)
	private String numCompras2;
	@Size(max=100)
	private String ultCompra2;
	@Size(max=100)
	private String maiorCompra2;
	@Size(max=100)
	private String maiorAtraso2;
	@Size(max=200)
	private String refCom3;
	@Size(max=100)
	private String numCompras3;
	@Size(max=100)
	private String ultCompra3;
	@Size(max=100)
	private String maiorCompra3;
	@Size(max=100)
	private String maiorAtraso3;
	@NotNull
	@Digits(integer = 8, fraction = 2)
	@NumberFormat(style=Style.NUMBER)
	private BigDecimal limiteCredito;
	@Size(max=10)
	private String diaCobranca;
	@Size(max=200)
	private String autorizacaoPessoas;
	@Size(max=200)
	private String enderecoCobranca;
	@Size(max=200)
	private String obsFin1;
	@Size(max=200)
	private String obsFin2;
	@Size(max=200)
	private String obsFin3;
	
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/*public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}*/
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/*public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}*/

}
