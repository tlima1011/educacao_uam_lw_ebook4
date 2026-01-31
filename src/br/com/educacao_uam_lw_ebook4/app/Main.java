package br.com.educacao_uam_lw_ebook4.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.educacao_uam_lw_ebook4.modelo.Aluno;
import br.com.educacao_uam_lw_ebook4.modelo.Aula;
import br.com.educacao_uam_lw_ebook4.modelo.Professor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		System.out.print("Informe o nome do aluno: "); 
		String n = ler.nextLine(); 
		System.out.print("Informe cpf do aluno: "); 
		String cpf = ler.nextLine(); 
		System.out.print("Informe endereço do aluno: "); 
		String endereco = ler.nextLine(); 
		System.out.print("Informe matricula do aluno: "); 
		String m = ler.nextLine(); 
		
		 
		Professor p = new Professor("Epaminondas", "233.333.334-22", "Rua Mané, 234", "(11) 8888-9999"); 
		String disciplina = "Programação Java com POO"; 
		double valor = 58;
		
		Aula aula1 = new Aula(10);
		Aluno a = new Aluno(n, cpf, m, aula1);
		
		
		Professor p1 = new Professor("Joana", "333.333.334-22", "Rua Zé, 434", "(11) 66669-9999"); 
		p1.disciplina = "Banco de Dados MySQL"; 
		p1.valor = 88;
			 
		//a.setAula(aula1); 
		
		System.out.println(a);
		System.out.println();
		System.out.println(p);
		System.out.println();
		System.out.println(p1);
		System.out.println();
		System.out.println(aula1);
		
		ler.close();
	}
}
