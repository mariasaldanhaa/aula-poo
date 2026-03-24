package Ex1;

import java.util.*;

public class ex1 {
	public static void main (String[] args) {
		// reading the number
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int number = scan.nextInt();
		
		int ant = number - 1;
		int suc = number + 1;
		System.out.printf("Antecessor do número %d: %d", number, ant);
		System.out.printf("\nSucessor do número %d: %d", number, suc);
		
		scan.close();
	}
}