package br.com.model;

public class Aluno {
	
	private String nome;
	private String codigo;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
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

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
	

}
