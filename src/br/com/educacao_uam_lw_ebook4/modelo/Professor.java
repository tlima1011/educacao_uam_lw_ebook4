package br.com.educacao_uam_lw_ebook4.modelo;

public class Professor extends Pessoa{
	
	public int valor; 
	public String disciplina; 
	
	public double calcular_horas() {
		return valor * 20; 
	}
	
	public double calcular_salario() {
		return calcular_horas() * 200;
	}

	@Override
	public String toString() {
		return "Professor [valor=" + valor + ", disciplina=" + disciplina + ", nome=" + nome + ", cpf=" + cpf
				+ ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", calcular_horas()="
				+ calcular_horas() + ", calcular_salario()=" + calcular_salario() + "]";
	}
	
}
