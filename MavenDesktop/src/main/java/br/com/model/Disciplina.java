package br.com.model;

public class Disciplina {
	
	private Long id;
	private String nome;
	private String codigo;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
	
