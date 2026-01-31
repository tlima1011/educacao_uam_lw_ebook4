package br.com.educacao_uam_lw_ebook4.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Aula {
	
	public int id; 
	private static int uc = 1; 
	public LocalDate data; 
	public int hora; 
	
	public Aula() {
		this.id = uc++; 
		this.hora = 0; 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.data = LocalDate.parse("01/01/2000", formatter) ; 
	}
	
	public Aula(int h) {
		this(); 
		this.hora = h; 
	}
	
	public Aula(int h, String d) {
		this(); 
		this.hora = h;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(d);
		this.data = LocalDate.parse(d, formatter) ; 
	}
	
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

	@Override
	public String toString() {
		return "Aula Criada => id# " + id + "\nData da Aula: " + data + "\nQuantidade horas: " + hora;
	}
}
