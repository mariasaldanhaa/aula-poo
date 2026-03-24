package Ex16;

import java.util.*;

public class Ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário bruto: ");
		double grossSalary = scan.nextDouble();
		
		System.out.println("Qual o valor da prestação a ser paga? ");
		double provision = scan.nextDouble();
		
		double INSS = 0.09 * grossSalary;
		double netSalary =	grossSalary - INSS;
		
		if(provision <= 0.3 * netSalary) {
			System.out.print("O empréstimo pode ser concedido !");
			System.out.printf("\nSalário líquido (S. L.): %.4f", netSalary);
			System.out.printf("\n30%% de S. L.: %.5f", 0.3 * netSalary);
		} else {
			System.out.print("O empréstimo não pode ser concedido !");
			System.out.printf("\nSalário líquido (S. L.): %.4f", netSalary);
			System.out.printf("\n30%% de S. L.: %.5f", 0.3 * netSalary);
		}
		scan.close();
	}
}
