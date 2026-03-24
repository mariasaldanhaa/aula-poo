package Ex13;

import java.util.*;

public class ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int number = scan.nextInt();
		
		if(number % 2 == 0) {
			System.out.printf("O número %d é par!", number);
		} else {
			System.out.printf("O número %d é ímpar!", number);
		}
		scan.close();
	}
}
