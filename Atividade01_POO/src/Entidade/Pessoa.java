package Entidade;

import java.time.LocalDate;

public class Pessoa {
	public String nome;
	public int ano;
	public double altura;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAno() {
		return ano;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public int calcularIdade() {
		int idade = LocalDate.now().getYear() - ano;
		
		return idade;
	}
}