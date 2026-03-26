package Carro;

import java.util.*;

public class Carro {
		public String marca;
		public String modelo;
		public String cor;
		public int ano;
		public String chassi;
		
		// set - coloca valor dentro do objeto
		// get - retorna o valor
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public String getModelo() {
			return modelo;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setAno(int ano) {
			this.ano = ano;
		}
		
		public int getAno() {
			return ano;
		}
		
		public void setChassi(String chassi) {
			this.chassi = chassi;
		}
		
		public String getChassi() {
			return chassi;
		}
		
		public double KmRodado(Scanner scan) {
			System.out.println("Entre com os km rodados: ");
			double km = scan.nextDouble();
			
			return km;
		}
		
		public void exibirInfo() {
			System.out.print("-----INFORMAÇÕES DO VEÍCULO-----");
			System.out.printf("\nMarca: %s", marca);
			System.out.printf("\nModelo: %s", modelo);
			System.out.printf("\nCor: %s", cor);
			System.out.printf("\nAno: %d", ano);
			System.out.printf("\nChassi: %s", chassi);
			System.out.print("\n--------------------------------");
		}
}
