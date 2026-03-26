package Ex25;

import java.util.*;

public class Ex25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] alturas = new double[10]; 
		double somaAltura = 0, media;
		int qtd = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite uma altura:");
			alturas[i] = scan.nextDouble();
			
			somaAltura += alturas[i];
			qtd++;
		}
		media = somaAltura / qtd;
		
		for(int i = 0; i < 10; i++) {
			if(alturas[i] > media) {
				System.out.printf("%.2f\n", alturas[i]);
			}
		}
		scan.close();
	}
}
