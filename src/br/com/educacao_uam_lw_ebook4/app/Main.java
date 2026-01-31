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
		
		String disciplina = "Programação Java com POO"; 
		int valor = 58;
		
		Aula aula1 = new Aula(10);
		Aluno a = new Aluno(n, cpf, m, aula1);
		Aula aula2 = new Aula(30);
		
		Professor p = new Professor("Epaminondas", "233.333.334-22", "Rua Mané, 234", "(11) 8888-9999",disciplina, valor , aula1);
		
		disciplina = "Banco de Dados MySQL"; 
		valor = 88;
		//Professor p1 = new Professor("Joana"); 
			 
		//a.setAula(aula1); 
		Professor p1 = new Professor("Joana Manoela", "555.333.334-22", "Rua José, 1000", "(11) 8888-0000", disciplina, valor, aula2);
		
		System.out.println(a);
		System.out.println();
		System.out.println(p);
		System.out.println();
		System.out.println(p1);
		System.out.println();
		//System.out.println(aula1);
		
		ler.close();
	}
}
