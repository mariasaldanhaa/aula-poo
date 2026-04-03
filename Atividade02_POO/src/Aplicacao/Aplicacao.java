package Aplicacao;

import java.util.*;
import Entidade.Pessoa;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pessoa[] p = new Pessoa[3];
		
		for(int i = 0; i < 3; i++) {
			p[i] = new Pessoa();
			
			System.out.printf("======================PESSOA %d======================", i + 1);
			System.out.println("\nNome:");
			p[i].setNome(scan.nextLine());
			
			System.out.println("\nAno de Nascimento:");
			p[i].setAno(scan.nextInt());
			
			System.out.println("\nAltura:");
			p[i].setAltura(scan.nextDouble());
			
			scan.nextLine(); // limpando o buffer
		}
		
		int idadeMaior = p[0].calcularIdade();
		int posicaoMaior = 0;
		
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("\n======================DADOS DA PESSOA %d======================", i + 1);
			System.out.printf("\nNome: %s", p[i].getNome());
			
			int idade = p[i].calcularIdade();
			
			System.out.printf("\nIdade: %d", idade);
			System.out.printf("\nAltura: %.2f", p[i].getAltura());
			
			if(idade > idadeMaior) {
				idade = idadeMaior;
				posicaoMaior = i;
			}
		}
		
		System.out.print("\n------------------------INFORMAÇÃO------------------------");
		System.out.printf("\nO(A) %s apresenta a maior idade.", p[posicaoMaior].getNome());
		
		scan.close();
	}
}
