package ex15;

import java.util.Scanner;

public class ex15 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int number1 = scan.nextInt(); 
		
		System.out.println("Digite o segundo número: ");
		int number2 = scan.nextInt();
		
		if(number1 > number2) {
			System.out.printf("O número %d é menor; o número %d é maior", number2, number1);
		} else if (number1 < number2) {
			System.out.printf("O número %d é menor; o número %d é maior", number1, number2);
		} else {
			System.out.printf("O número %d é igual o número %d", number1, number2);
		}
		scan.close();
	}
}
