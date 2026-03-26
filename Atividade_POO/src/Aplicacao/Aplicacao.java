// Aluna: Maria Eduarda Saldanha Alves

package Aplicacao;

import java.util.*;
import Carro.Carro;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		double km = carro.KmRodado(scan);
		double valorGasto = 7.5 * km;
		
		scan.nextLine(); // limpando o buffer
		
		System.out.println("Informe a marca do veículo:");
		carro.setMarca(scan.nextLine());
		
		System.out.println("Informe o modelo do veículo:");
		carro.setModelo(scan.nextLine());
		
		System.out.println("Informe a cor do veículo:");
		carro.setCor(scan.nextLine());
		
		System.out.println("Informe o ano do veículo:");
		carro.setAno(scan.nextInt());
		
		scan.nextLine(); // limpando o buffer novamente
		
		System.out.println("Informe o chassi do veículo:");
		carro.setChassi(scan.nextLine());
		
		carro.exibirInfo();
		
		System.out.print("\n");
		System.out.print("\n--------QUILOMETRAGEM--------");
		System.out.printf("\nKM Rodados: %.2f", km);
		System.out.printf("\nValor gasto: R$%.2f", valorGasto);
		System.out.print("\n-----------------------------");
		
		System.out.print("\n");
		System.out.print("\n=====Escolha a ação que o veículo irá executar=====");
		System.out.print("\n1 - Frear");
		System.out.print("\n2 - Acelerar");
		System.out.print("\n3 - Parar");
		System.out.print("\n4 - Trocar Marcha");
		System.out.print("\n=====================================================");
		System.out.println("\nDigite uma dessas opções:");
		int opcao = scan.nextInt();
		
		while (opcao < 1 || opcao > 4) {
			System.out.print("\n");
			System.out.print("Ops! Algo deu errado.");
			System.out.print("\n=====Escolha a ação que o veículo irá executar=====");
			System.out.print("\n1 - Frear");
			System.out.print("\n2 - Acelerar");
			System.out.print("\n3 - Parar");
			System.out.print("\n4 - Trocar Marcha");
			System.out.print("\n=====================================================");
			System.out.println("\nDigite uma dessas opções:");
			opcao = scan.nextInt();
		}
		
		switch(opcao) {
			case 1:
				System.out.print("\nO carro está freando");
				break;
			case 2:
				System.out.print("\nO carro está acelerando");
				break;
			case 3:
				System.out.print("\nO carro está parando");
				break;
			case 4:
				System.out.print("\nO carro está trocando de marcha");
				break;
			}
		scan.close();
	}
}
