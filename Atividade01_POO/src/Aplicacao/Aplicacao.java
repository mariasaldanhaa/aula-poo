package Aplicacao;

import java.util.*;
import Entidade.Pessoa;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		System.out.println("Digite o nome da pessoa: ");
		p1.nome = scan.nextLine();
		
		System.out.println("Digite o ano de nascimento: ");
		p1.ano = scan.nextInt();
		
		System.out.println("Digite a altura: ");
		p1.altura = scan.nextDouble();
		
		int idade = p1.calcularIdade();
		
		String nome = p1.nome;
		double altura = p1.altura;
		
		System.out.printf("O %s tem %d e %.2f de altura.", nome, idade, altura);
		
		scan.close();
	}
}