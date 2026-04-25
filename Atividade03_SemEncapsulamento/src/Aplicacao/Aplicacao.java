package Aplicacao;
import java.util.*;
import Entidade.Aluno;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("--- CADASTRO DE ALUNO (SEM ENCAPSULAMENTO) ---\n");
		System.out.println("Digite o nome: ");
		aluno.nome = scan.nextLine();
		
		System.out.println("Digite a matrícula: ");
		aluno.matricula = scan.nextLine();
		
		System.out.println("Digite a nota: ");
		aluno.nota = scan.nextDouble();
		scan.nextLine(); // consome quebra de linha
		
		int escolha = -1; // começa com valor inválido
		
		while (escolha != 0) {
			System.out.print("\n--- ESCOLHA O QUE FAZER A SEGUIR ---");
			System.out.print("\n	0 - FINALIZAR	");
			System.out.print("\n	1 - IMPRESSÃO	");
			System.out.print("\n	2 - ATUALIZAR DADOS	");
			System.out.println("\nDigite o número da escolha: ");
			escolha = scan.nextInt();
			scan.nextLine(); // consome quebra de linha
			
			switch(escolha) {
				case 0:
					System.out.println("Programa finalizado!");
					break;
					
				case 1:
					System.out.print("\n--- DADOS CADASTRADOS ---");
					System.out.printf("\nNome: %s", aluno.nome);
					System.out.printf("\nMatrícula: %s", aluno.matricula);
					System.out.printf("\nNota: %.2f", aluno.nota);
					
					System.out.print("\n--- DEMONSTRANDO O PROBLEMA ---");
					
					if (aluno.nome == null || aluno.matricula == null || aluno.matricula.equals("") || aluno.nome.equals("")) {
						System.out.print("\nO campo nome ou matricula pode estar vazio!");
					} if (aluno.nota < 0) {
						System.out.print("\nNota negativa!");
					} else {
						System.out.print("\nNenhum problema nos campos.");
					}
					System.out.println();
					break;
					
				case 2:
					System.out.print("\n--- ATUALIZAR CADASTRO DO ALUNO ---\n");
					System.out.println("Digite o nome: ");
					aluno.nome = scan.nextLine();
					
					System.out.println("Digite a matrícula: ");
					aluno.matricula = scan.nextLine();
					
					System.out.println("Digite a nota: ");
					aluno.nota = scan.nextDouble();
					scan.nextLine();
					System.out.println("Cadastro atualizado com sucesso!");
					break;
					
				default:
					System.out.println("Opção inválida! Digite 0, 1 ou 2.");
					break;
			}
		}
		scan.close();
	}
}