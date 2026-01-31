package br.com.educacao_uam_lw_ebook4.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.educacao_uam_lw_ebook4.modelo.Aluno;
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
		
		Aluno a = new Aluno(n, cpf, m); 
		Professor p = new Professor("Epaminondas", "233.333.334-22", "Rua Mané, 234", "(11) 8888-9999"); 
		p.disciplina = "Programação Java com POO"; 
		p.valor = 58;
		
		System.out.println(a);
		System.out.println();
		System.out.println(p);
		
		ler.close();
	}
}
