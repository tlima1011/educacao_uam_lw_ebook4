package br.com.educacao_uam_lw_ebook4.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.educacao_uam_lw_ebook4.modelo.Aluno;

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
		System.out.println(a);
		
		
		
		ler.close();

	}

}
