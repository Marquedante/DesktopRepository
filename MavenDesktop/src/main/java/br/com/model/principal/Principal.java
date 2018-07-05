package br.com.model.principal;

import br.com.model.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Aluno al = new Aluno("Caio","12JE0",new Integer(9));
		
		System.out.println(al.getNome()+" - "+al.getCodigo());

	}

}
