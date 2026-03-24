package ex6;

import java.util.*;

public class ex6 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da altura da lata(h): ");
		float h = scan.nextFloat();
		
		System.out.println("Digite o valor do raio da lata(r): ");
		float r = scan.nextFloat();
		
		// como assim em java não tem ** para potência!!!???
		// no exercício está 3.14159, optei por Math.PI pra ficar mais legível
		float volume = (float) (Math.PI * Math.pow(r,2) * h);
		
		System.out.printf("Volume da lata: %.2f", volume);
		
		scan.close();
	}
}
