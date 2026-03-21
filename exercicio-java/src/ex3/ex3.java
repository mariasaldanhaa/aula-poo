package ex3;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int numberA = scan.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int numberB = scan.nextInt();
		
		int numberC = numberA;
		numberA = numberB;
		
		System.out.printf("A = %d", numberA);
		System.out.printf("\nB = %d", numberC);
		
		scan.close();
	}
}
