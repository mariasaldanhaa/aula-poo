package Aplicacao;
import java.util.*;
import Entidade.Esporte;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Esporte esporte = new Esporte();
		
		System.out.printf("--------------BRASIL---------------\n");
		
		System.out.println("Informe o nome do esporte:");
		esporte.setNome(scan.nextLine());
		
		System.out.printf("--------------%s---------------\n", esporte.getNome());
		
		System.out.println("Informe o link de descricao do esporte:");
		esporte.setNome(scan.nextLine());
		
		System.out.println("Informe o ano de inclusão do esporte nas olimpíadas:");
		esporte.setAno(scan.nextInt());
		
		System.out.println("Informe a quantidade de medalhas de ouro do Brasil:");
		esporte.setOuro(scan.nextInt());
		
		System.out.println("Informe a quantidade de medalhas de prata do Brasil:");
		esporte.setPrata(scan.nextInt());
		
		System.out.println("Informe a quantidade de medalhas de bronze do Brasil:");
		esporte.setBronze(scan.nextInt());
		
		scan.nextLine();
		
		System.out.printf("\n-------------//--------------");
		
		System.out.printf("\n-----------------------------\n");
		
		System.out.println("Informe o nome do país primeiro colocado no ranking:");
		esporte.setNome1(scan.nextLine());
		
		System.out.printf("--------------%s---------------\n", esporte.getNome1());
		
		System.out.println("Informe o link de descricao do esporte:");
		esporte.setLink1(scan.nextLine());
		
		System.out.println("Informe o ano de inclusão do esporte nas olimpíadas:");
		esporte.setAno1(scan.nextInt());
		
		System.out.println("Informe a quantidade de medalhas de ouro:");
		esporte.setOuro1(scan.nextInt());
		
		System.out.println("Informe a quantidade de medalhas de prata:");
		esporte.setPrata1(scan.nextInt());
		
		System.out.println("Informe a quantidade de medalhas de bronze:");
		esporte.setBronze1(scan.nextInt());
		
		int diferencaOuro = esporte.diferencaOuro();
		int diferencaPrata = esporte.diferencaPrata();
		int diferencaBronze = esporte.diferencaBronze();
		
		System.out.printf("--------------%s---------------\n", esporte.getNome1());
		System.out.printf("Link: %s", esporte.getLink1());
		System.out.printf("\nAno de inclusao: %d", esporte.getAno());
		System.out.printf("\nQuantidade de medalhas de Ouro: %d", esporte.getOuro());
		System.out.printf("\nQuantidade de medalhas de Prata: %d", esporte.getPrata());
		System.out.printf("\nQuantidade de medalhas de Bronze: %d", esporte.getBronze());
		System.out.printf("\n-----------------------------");
		
		System.out.printf("\n-------------//--------------");
		
		System.out.printf("\nDIFERENÇA DAS MEDALHAS ENTRE BRASIL E %s",esporte.getNome1());
		System.out.printf("\nOuro: %d", diferencaOuro);
		System.out.printf("\nPrata: %d", diferencaPrata);
		System.out.printf("\nBronze: %d", diferencaBronze);
		scan.close();
	}
}