package Ex4;

import java.util.*;


public class ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		int celsius = scan.nextInt();
		
		float fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.printf("Temperatura em Fahrenheit: %.2f", fahrenheit);
		
		scan.close();
	}
}