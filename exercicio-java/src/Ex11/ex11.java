package Ex11;

import java.util.*;

public class ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário mínio(R$): ");
		double salary =  scan.nextDouble();
				
		System.out.println("Digite a quantidade de quilowatts gasta(kW): ");
		double kw = scan.nextDouble();
		
		double valueKW = salary / 7 / 100;
		
		double withoutDiscount = valueKW * 234;
		
		double withDiscount = withoutDiscount - withoutDiscount * 0.1;
		
		System.out.printf("Valor de cada quilowatt(R$): %.6f", valueKW);
		System.out.printf("\nValor a ser pago sem o desconto(R$): %.3f", withoutDiscount);
		System.out.printf("\nValor a ser pago com o desconto(R$): %.3f", withDiscount);
		
		scan.close();
	}
}
