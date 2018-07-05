package br.com.model.principal;

import br.com.model.Aluno;

public class Principal {

	public static void main(String[] args) { 
		
		Aluno al = new Aluno("Caio","12JE0",new Integer(12),"123456");
		System.out.println(al.getNome()+" - "+al.getCodigo()+" - "+al.getIdade());
		
		
		Aluno al1 = new Aluno("Diogo","RT90",new Integer(7),"987433");
		System.out.println(al1.getNome()+" - "+al1.getCodigo()+" - "+al1.getIdade());
		
		
		Aluno al2 = new Aluno("Renata","QW23",new Integer(8),"785456");
		System.out.println(al2.getNome()+" - "+al2.getCodigo()+" - "+al2.getIdade());
		
	}

}
