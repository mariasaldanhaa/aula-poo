package Ex21;

import java.util.*;

public class Ex21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: ");
		int number = scan.nextInt();
		
		boolean primo = true;
		
		while (number < 1) {
			System.out.println("Digite um número qualquer maior ou igual a 1: ");
			number = scan.nextInt();
		} 
		
		for(int i = 2; i < number; i++) {
				if (number % i == 0) {
					primo = false;
				}
			}
			
			if (primo && number >= 1) {
				System.out.printf("%d é primo!", number);
			} else {
				System.out.printf("%d não primo!", number);
			}
		scan.close();
	}
}