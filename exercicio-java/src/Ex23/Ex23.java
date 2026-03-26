package Ex23;

import java.util.*;

public class Ex23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double menor = 99, maior = 0, sumM = 0, sumTotal = 0;
		int contM = 0, contTotal = 0;
		
		for(int i = 1; i <= 6; i++) {
			System.out.println("Código do sexo do aluno (M = 1, F = 2): ");
			int code = scan.nextInt();
			
			System.out.println("Digite a altura do aluno: ");
			double altura = scan.nextDouble();
			
			if (altura > maior) {
				maior = altura;
			}
			
			if (altura < menor) {
				menor = altura;
			}
			
			if (code == 2) {
				contM++;
				sumM = sumM + altura;
			}
			sumTotal = sumTotal + altura;
			contTotal++;
		}
		System.out.printf("A maior altura da turma: %.2f", maior);
		System.out.printf("\nA menor altura da turma: %.2f", menor);
		System.out.printf("\nMédia de altura das mulheres: %.2f", sumM / contM);
		System.out.printf("\nMédia de altura da turma: %.2f", sumTotal / contTotal);
		
		scan.close();
	}
}
