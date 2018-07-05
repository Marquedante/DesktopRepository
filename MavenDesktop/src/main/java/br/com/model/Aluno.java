package br.com.model;

import java.io.Serializable;

public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String codigo;
	private Integer idade;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String codigo, Integer idade) {
		this.nome = nome;
		this.codigo = codigo;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	

	@Override
	public String toString() {
		return "Aluno : nome=" + nome + ", codigo=" + codigo;
	}
	
	

}
