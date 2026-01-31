package br.com.educacao_uam_lw_ebook4.modelo;

import java.util.Date;

public class Aula {
	
	public int id; 
	public Date data; 
	public int hora; 
	
	public void inserir_aula() {
		this.hora++;
	}
	
	public void editar_aula() {
		System.out.println("Editando aula...");
	}
	
	public void listar_aula() {
		System.out.println(data); 
		System.out.println(hora);
	}
	
	public void relatorio_completo() {
		System.out.println("...:::Relatorio Completo:::...");
	}

}
