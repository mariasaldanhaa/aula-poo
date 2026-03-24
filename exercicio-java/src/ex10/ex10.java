package ex10;

import java.util.*;

public class ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do tempo gasto na viagem: ");
		int time = scan.nextInt();
		
		System.out.println("Digite o valor da velocidade média: ");
		int speed = scan.nextInt();
		
		int liters = time * speed / 12;
		
		System.out.printf("Quantidade de litros de combustível gasto na viagem: %d", liters);
		
		scan.close();
	}
}
