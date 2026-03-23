package ex7;

import java.util.Scanner;

public class ex7 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço bruto do produto: ");
		double grossPrice = scan.nextDouble();
		// double - é um tipo que guarda números decimais, mas com o dobro da precisão do float
		
		// no terminal do eclipse, a vírgula é como separador do decimal
		double discount = grossPrice * 0.09;
		double productDiscount = grossPrice - discount;
		
		System.out.printf("Valor do desconto: %.3f", discount);
		System.out.printf("\nPreço do produto com o desconto (0.09): %.3f", productDiscount);
		
		scan.close();
	}
}