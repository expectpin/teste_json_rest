package br.com.poc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Logradouro {

	@Id
	private Integer cep;
	@Column
	private String tipoDeLogradouro;
	@Column
	private String logradouro;
	@Column
	private String bairro;
	@Column
	private String cidade;
	@Column
	private String estado;
	
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getTipoDeLogradouro() {
		return tipoDeLogradouro;
	}
	public void setTipoDeLogradouro(String tipoDeLogradouro) {
		this.tipoDeLogradouro = tipoDeLogradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
