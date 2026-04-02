package Ex28;
import java.util.*;

public class Ex28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] industrias = new int[2][3];
		
		double[] lucros = new double[3];
		
		// Industrias
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("Informe a quantidade produzida de cada produto por mês [%d, %d]: ", i + 1, j + 1);
				industrias[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("\nInforme o lucro do produto %d: ", i + 1);
			lucros[i] = scan.nextDouble();
		}
		
		double[] lucroIndustria = new double[2];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				lucroIndustria[i] += industrias[i][j] * lucros[j];
			}
		}
		
		System.out.printf("\nLucro da industria 1: %.0f", lucroIndustria[0]);
		System.out.printf("\nLucro da industria 2: %.0f", lucroIndustria[1]);
		
		if(lucroIndustria[0] > lucroIndustria[1]) {
			System.out.print("\nO investimento na Industria 1 é o melhor.");
		} else if (lucroIndustria[0] < lucroIndustria[1]){
			System.out.print("\nO investimento na Industria 2 é o melhor.");
		} else {
			System.out.print("\nAs duas indústrias têm o mesmo lucro.");
		}
		
		scan.close();
	}
}