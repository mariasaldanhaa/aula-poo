package Aplicacao;
import java.util.*;
import Entidade.Aluno;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno =  new Aluno();
		
		System.out.print("--- CADASTRO DE ALUNO (COM ENCAPSULAMENTO) ---\n");
		
		boolean cadastroValido = false;
		
		while(!cadastroValido) {
			try {
				System.out.println("Digite o nome: ");
				String nome = scan.nextLine();
				aluno.setNome(nome);
				
				System.out.println("Digite a matrícula: ");
				String matricula = scan.nextLine();
				aluno.setMatricula(matricula);
				
				System.out.println("Digite a nota: ");
				Double nota = scan.nextDouble();
				aluno.setNota(nota);
				
				scan.nextLine(); // limpando o buffer
				
				cadastroValido = true;
                System.out.println("Cadastro realizado com sucesso!\n");
			} catch (IllegalArgumentException e) {
				System.out.println("Por favor, digite os dados novamente.\n");
				scan.nextLine(); // limpando o buffer
			}
		}
		
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
					System.out.printf("\nNome: %s", aluno.getNome());
					System.out.printf("\nMatrícula: %s", aluno.getMatricula());
					System.out.printf("\nNota: %.2f", aluno.getNota());
					break;
				case 2:
					boolean atualizacaoValida = false;
					
					while(!atualizacaoValida) {
						try {
							System.out.print("\n--- ATUALIZAR CADASTRO DO ALUNO ---\n");
							System.out.println("Digite o nome: ");
							aluno.setNome(scan.nextLine());
							
							System.out.println("Digite a matrícula: ");
							aluno.setMatricula(scan.nextLine());
							
							System.out.println("Digite a nota: ");
							aluno.setNota(scan.nextDouble());
							scan.nextLine();
							
							atualizacaoValida = true; 
							System.out.println("Cadastro atualizado com sucesso!");
						} catch (IllegalArgumentException e) {
							System.out.println("Por favor, digite os dados novamente.\n");
							scan.nextLine(); // limpando o buffer
						}
					}
					break;
				default:
					System.out.println("Opção inválida! Digite 0, 1 ou 2.");
					break;
			}
		}
		scan.close();
	}
}
