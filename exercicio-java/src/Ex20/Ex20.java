package Ex20;

import java.util.*;

public class Ex20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o limite inferior (a): ");
		int a = scan.nextInt();
		
		System.out.println("Digite o limite superior (b): ");
		int b = scan.nextInt();
		
		while(b < a) {
			System.out.print("O valor de b tem que ser maior que a!");
			System.out.println("\nDigite o valor superior (b): ");
			b = scan.nextInt();
		}
		
		int product = 1;
		int sum = 0;
		int countOdd = 0;
		
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0) {
				product *= i;
			} else {
				sum += i;
				countOdd++;
			}
		}
		double average = sum / countOdd;
		
		System.out.printf("Média dos ímpares: %.2f", average);
		System.out.printf("\nProdutório dos pares: %d", product);
		
		scan.close();
	}
}