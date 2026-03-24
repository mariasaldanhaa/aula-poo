package Ex14;

import java.util.*;

public class ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o mês atual: ");
		int month = scan.nextInt();
		
		System.out.println("Digite a placa do veículo - 4 dígitos: ");
		int plate = scan.nextInt();
		
		if (month > 12 || plate > 9999) {
			System.out.printf("Verifique se:"
					+ "\n - O valor do mês digitado é entre 1 e 12"
					+ "\n - A placa contém somente 4 dígitos");
		} else {
			System.out.printf("O IPVA vence no mês (%d)", plate % 10);
		}
		
		scan.close();
	}
}
