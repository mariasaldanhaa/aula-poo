package Ex5;

import java.util.*;

public class ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora: ");
		int hour = scan.nextInt();
		
		System.out.println("Digite o valor dos minutos: ");
		int minutes = scan.nextInt();
		
		int total = hour * 60 + minutes;
		
		System.out.printf("Total de minutos que se passaram desde o início do dia: %d", total);
		
		scan.close();
	}
}
