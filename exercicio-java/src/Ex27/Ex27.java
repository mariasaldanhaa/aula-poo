package Ex27;
import java.util.*;

public class Ex27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("Digite o valor da posição[%d, %d]: ", i + 1, j + 1);
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.print("Matriz inserida:\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("%d.\t", matriz[i][j]);
			}
			System.out.println();
		}
		
		boolean triangularSuperior = true;
		boolean triangularInferior = true;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i > j) { // elementos abaixo da diagonal principal
					if(matriz[i][j] != 0) {
						triangularSuperior = false;
					}
				}
				if(i < j) { // elementos acima da diagonal principal
					if(matriz[i][j] != 0) {
						triangularInferior = false;
					}
				}
			}
		}
		
		if(triangularSuperior && triangularInferior) {
			System.out.print("Matriz diagonal.");
		} else if(triangularSuperior) {
			System.out.print("Matriz triangular superior.");
		} else {
			System.out.print("Matriz triangular inferior.");
		}
		
		scan.close();
	}
}