package Ex22;

import java.util.*;

public class Ex22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de termos:");
		int termos = scan.nextInt();
		
		double h = 0;
		int sinal = 1, denominador = 1;
		
		for(int i = 0; i < termos; i++) {
			h += sinal * (1.0 / denominador);
			denominador += 2;
			sinal *= -1;
		}
		System.out.printf("H = %.10f\n", h);
		
		scan.close();
	}
}
