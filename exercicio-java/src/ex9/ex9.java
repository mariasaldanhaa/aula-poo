package ex9;

import java.util.Scanner;

public class ex9 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do depósito: ");
		double deposit = scan.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros: ");
		double interestRate = scan.nextDouble();
		
		double yield = deposit * interestRate / 100;
		double total = deposit + yield;
		
		System.out.printf("Valor do rendimento: %.1f", yield);
		System.out.printf("\nValor total depois do rendimento: %.1f", total);
		
		scan.close();
	}
}
