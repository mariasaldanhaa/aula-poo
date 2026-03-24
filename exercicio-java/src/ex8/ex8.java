package ex8;

import java.util.*;

public class ex8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora-aula: ");
		double classHour = scan.nextDouble();
		
		System.out.println("Digite o número de aulas dadas no mês: ");
		double classes = scan.nextDouble();
		
		System.out.println("Digite o percentual de desconto do INSS: ");
		double percentage = scan.nextDouble();
		
		double salary = (classHour * classes) * (1 - percentage / 100);
				
		System.out.printf("Salário líquido: R$%.1f", salary);
		
		scan.close();
	}
}
