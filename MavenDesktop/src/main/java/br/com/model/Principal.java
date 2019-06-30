
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
			
		Aluno al5 = new Aluno("Xavier","XXX",new Integer(2),"2");
		System.out.println(al5.getNome()+" - "+al5.getCodigo()+" - "+al5.getIdade());
				
		Aluno al6 = new Aluno("Antonio","ANT",new Integer(2),"2");
		System.out.println(al6.getNome()+" - "+al6.getCodigo()+" - "+al6.getIdade());

		Aluno al7 = new Aluno("Flavia","FLV",new Integer(2),"2");
		System.out.println(al7.getNome()+" - "+al7.getCodigo()+" - "+al7.getIdade());
	

		Aluno al8 = new Aluno("Tales","TLS",new Integer(2),"2");
		System.out.println(al8.getNome()+" - "+al8.getCodigo()+" - "+al8.getIdade());

		
		Aluno al9 = new Aluno("Fernando","FRN",new Integer(2),"2");
		System.out.println(al9.getNome()+" - "+al9.getCodigo()+" - "+al9'.getIdade());
	}
 
}
