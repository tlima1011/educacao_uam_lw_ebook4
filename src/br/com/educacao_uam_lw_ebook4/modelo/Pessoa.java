package br.com.educacao_uam_lw_ebook4.modelo;

public abstract class Pessoa {
	
	private int id; 
	private static int uc = 1; 
	public String nome; 
	public String cpf; 
	public String endereco; 
	public String telefone; 
	public String email; 
	
	
	public Pessoa() {
		id = ++uc; 
		this.email = this.nome + "@uam.com.br";
	}
	
	public Pessoa(String n) {
		this(); 
		this.nome = n;
	}
	
	public Pessoa(String n, String c) {
		this(); 
		this.nome = n; 
		this.cpf = c; 
		this.endereco = "N/A"; 
		this.telefone = "(xx) 0000-0000";
	}
	
	public Pessoa(String n, String c, String e) { 
		this(); 
		this.nome = n; 
		this.cpf = c; 
		this.endereco = e; 
		this.telefone = "(xx) 0000-0000";
	}
	
	public Pessoa(String n, String c, String e, String t) { 
		this(); 
		this.nome = n; 
		this.cpf = c; 
		this.endereco = e; 
		this.telefone = t;
	}
	
	public void cadastrar() {
		System.out.println("Usuário cadastrado");
	}
	
	public int editar(int i) {
		return 0; 
	}
	
	public void listar() {
		System.out.println("Usuário listado");
	}
	
	public int excluir(int i) {
		return 0;
	}
	
	
	
	
	
	
	

}
