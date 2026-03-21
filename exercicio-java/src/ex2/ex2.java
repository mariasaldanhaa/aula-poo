package ex2;

import java.util.Scanner;

public class ex2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		float number1 = scan.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float number2 = scan.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		float number3 = scan.nextFloat();
		
		float media = (number1 + number2 + number3) / 3;
		
		System.out.printf("A média aritmética de %.2f, %.2f e %.2f: %.2f", number1, number2, number3, media);
		
		scan.close();
	}
}
