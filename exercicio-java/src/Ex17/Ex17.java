package Ex17;

import java.util.*;

public class Ex17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o menor valor do intervalo (A): ");
		double A = scan.nextDouble();
		
		System.out.println("Digite o maior valor do intervalo (B): ");
		double B = scan.nextDouble();
		
		System.out.println("Digite um número real: ");
		double number = scan.nextDouble();
		
		if(number >= A && number <= B) {
			System.out.printf("O número %.4f pertence ao intervalo [%f ; %f]", number, A, B);
		} else {
			System.out.printf("O número %.4f não pertence ao intervalo [%f ; %f]", number, A, B);
		}
		scan.close();
	}
}