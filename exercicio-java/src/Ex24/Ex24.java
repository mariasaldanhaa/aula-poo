package Ex24;

import java.util.*;

public class Ex24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];
		
		int contPar = 0, contImpar = 0;
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = scan.nextInt();
			
			if (numeros[i] % 2 == 0) {
				pares[contPar] = numeros[i];
				contPar++;
			} else {
				impares[contImpar] = numeros[i];
				contImpar++;
			}
		}
		
		System.out.printf("Vetor com os valores pares:\n");
		System.out.printf("[");
		for(int i = 0; i < contPar; i++) {
			System.out.print(pares[i] + ",");
		}
		System.out.printf("]");
		
		System.out.printf("\nVetor com os valores ímpares:\n");
		System.out.printf("[");
		for(int i = 0; i < contImpar; i++) {
			System.out.print(impares[i] + ",");
		}
		System.out.printf("]");
		scan.close();
	}
}
