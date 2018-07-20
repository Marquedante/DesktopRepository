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
		
		Aluno a3 = new Aluno("Tiago","0949",new Integer(33),"09586");
		System.out.println(a3.getNome()+" - "+a3.getCodigo()+" - "+a3.getIdade());
		
		
		Aluno al4 = new Aluno("Fernando","FRND89",new Integer(32),"2345");
		System.out.println(al4.getNome()+" - "+al4.getCodigo()+" - "+al4.getIdade());
		
		
		
	}
 
}
