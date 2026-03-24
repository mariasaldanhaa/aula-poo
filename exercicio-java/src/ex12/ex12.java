package ex12;

import java.util.*;

public class ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: ");
		int number = scan.nextInt();
		
		if(number > 20) {
			System.out.printf("Número digitado: %d", number);
		}
		
		scan.close();
	}
}
