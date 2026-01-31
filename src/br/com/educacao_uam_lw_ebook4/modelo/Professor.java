package br.com.educacao_uam_lw_ebook4.modelo;

public class Professor extends Pessoa{
	
	public int valor; 
	public String disciplina; 
	public Aula aula; 
	
	public Professor(String n) {
		super(n);
	}
	
	public Professor(String n, String c, Aula a) {
		super(n, c);
		this.aula = a; 
	}
	
	public Professor(String n, String c, String e, Aula a) {
		super(n, c, e);
		this.aula = a; 
	}
	
	public Professor(String n, String c, String e, String t, Aula a) {
		super(n, c, e, t);
		this.aula = a; 
	}
	//Professor p = new Professor("Epaminondas", "233.333.334-22", "Rua Mané, 234", "(11) 8888-9999", aula2);
	
	//Professor p = new Professor("Epaminondas", "233.333.334-22", "Rua Mané, 234", "(11) 8888-9999",disciplina, valor , aula1);
	
	public Professor(String n, String c, String e, String t, String d, int v, Aula a) { 
		super(n, c, e, t);
		this.disciplina = d; 
		this.valor = v; 
		this.aula = a;
	}
	
	public double calcular_horas() {
		return valor * 20; 
	}
	
	public double calcular_salario() {
		return calcular_horas() * 200;
	}

	@Override
	public String toString() {
		return String.format(
		        "Professor:"
		      + "\nNome: %s"
		      + "\nCPF: %s"
		      + "\nDisciplina: %s"
		      + "\nEndereço: %s"
		      + "\nTelefone: %s"
		      + "\nE-mail: %s"
		      + "\nValor $ %d"
		      + "\nHoras: %.2f"
		      + "\nSalário $ %.2f"
		      + "\nAula:\n%s",
		        nome,
		        cpf,
		        disciplina,
		        endereco,
		        telefone,
		        email,
		        valor,                // int → %d
		        calcular_horas(),     // double → %.2f
		        calcular_salario(),   // double → %.2f
		        aula);                  // objeto → %s (toString) 
	}
}
