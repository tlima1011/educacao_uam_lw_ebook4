package br.com.educacao_uam_lw_ebook4.modelo;

public class Aluno extends Pessoa {
	
	public String matricula; 
	public Aula aula; 
	
	public Aluno(String n) {
		super(n);
	}
	
	public Aluno(String n, String c) {
		super(n, c);
	}
	
	public Aluno(String n, String c, String m) {
		super(n, c);
		this.matricula = m;
		this.email = n + "@uam.com.br"; 
	}
	
	public Aluno(String n, String c, String m, Aula a) {
		super(n, c);
		this.matricula = m;
		this.email = n + "@uam.com.br"; 
		this.aula = a; 
	}
	
	/*public void setAula(Aula aula) {
		this.aula = aula;
	}*/

	public void listar_frequencia() {
		System.out.println("Frequencia Computada!");
	}
	
	public void listar_notas() {
		System.out.println("Nota Listada");
	}

	@Override
	public String toString() {
		return "Aluno [Matricula=" + matricula + "\nNome: " + nome + "\nCpf=" + cpf + "\nEndereco=" + endereco
				+ "\nTelefone=" + telefone + "\nEmail=" + email + "\nAula: " + aula;
	}
}
