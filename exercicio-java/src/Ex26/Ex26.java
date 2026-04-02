package Ex26;
import java.util.*;

public class Ex26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("Digite o valor da posição[%d, %d]: ", i + 1, j + 1);
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.print("\nMatriz inserida:\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("%d.\t", matriz[i][j]);
			}
			System.out.println();
		}
		System.out.print("\nElementos da diagonal primária: ");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}
		System.out.print("\nElementos da diagonal secundária: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i + j == matriz.length - 1) {
					System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
		
		scan.close();
	}
}
