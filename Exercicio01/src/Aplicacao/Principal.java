package Aplicacao;
import java.util.*;
import Entidade.Esporte;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Esporte esporte = new Esporte();
		
		System.out.printf("--------------BRASIL---------------\n");
		
		System.out.println("Informe o nome do esporte:");
		esporte.nome = scan.nextLine();
		String nome = esporte.nome;
		
		System.out.printf("--------------%s---------------\n", nome);
		
		System.out.println("Informe o link de descricao do esporte:");
		esporte.link = scan.nextLine();
		String link = esporte.link;
		
		System.out.println("Informe o ano de inclusão do esporte nas olimpíadas:");
		esporte.ano = scan.nextInt();
		int ano = esporte.ano;
		
		System.out.println("Informe a quantidade de medalhas de ouro do Brasil:");
		esporte.qtdOuro = scan.nextInt();
		int qtOuro = esporte.qtdOuro;
		
		System.out.println("Informe a quantidade de medalhas de prata do Brasil:");
		esporte.qtdPrata = scan.nextInt();
		int qtPrata = esporte.qtdPrata;
		
		System.out.println("Informe a quantidade de medalhas de bronze do Brasil:");
		esporte.qtdBronze = scan.nextInt();
		int qtBronze = esporte.qtdBronze;
		
		System.out.printf("\n-------------//--------------");
		
		System.out.printf("\n-----------------------------");
		
		System.out.println("Informe o nome do país primeiro colocado no ranking:");
		esporte.nomePais = scan.nextLine();
		String nomePais = esporte.nomePais;
		
		System.out.printf("--------------%s---------------\n", nomePais);
		
		System.out.println("Informe o link de descricao do esporte:");
		esporte.link1 = scan.nextLine();
		String link1 = esporte.link1;
		
		System.out.println("Informe o ano de inclusão do esporte nas olimpíadas:");
		esporte.ano1 = scan.nextInt();
		int ano1 = esporte.ano1;
		
		System.out.println("Informe a quantidade de medalhas de ouro do Brasil:");
		esporte.qtdOuro1 = scan.nextInt();
		int qtOuro1 = esporte.qtdOuro1;
		
		System.out.println("Informe a quantidade de medalhas de prata do Brasil:");
		esporte.qtdPrata = scan.nextInt();
		int qtPrata1 = esporte.qtdPrata1;
		
		System.out.println("Informe a quantidade de medalhas de bronze do Brasil:");
		esporte.qtdBronze = scan.nextInt();
		int qtBronze1 = esporte.qtdBronze1;
		
		int diferencaOuro = esporte.diferencaOuro();
		int diferencaPrata = esporte.diferencaPrata();
		int diferencaBronze = esporte.diferencaBronze();
		
		System.out.printf("\n--------------%s---------------", nome);
		System.out.printf("--------------%s---------------\n", nomePais);
		System.out.printf("Link: %s", link1)
		System.out.printf("Ano de inclusao: %d",ano)
		System.out.printf("\n-----------------------------");
		
		System.out.printf("\n-------------//--------------");
		
		scan.close();
	}
}
