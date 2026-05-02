package Entidade;

public class Esporte {
	public String nome;
	public String link;
	public int ano;
	public int qtdOuro;
	public int qtdPrata;
	public int qtdBronze;
	public String nomePais;
	public String link1;
	public int ano1;
	public int qtdOuro1;
	public int qtdPrata1;
	public int qtdBronze1;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setOuro(int qtdOuro) {
		this.qtdOuro = qtdOuro;
	}
	public void setPrata(int qtdPrata) {
		this.qtdPrata = qtdPrata;
	}
	public void setBronze(int qtdBronze) {
		this.qtdBronze = qtdBronze;
	}
	public String getNome() {
		return nome;
	}
	public String getLink() {
		return link;
	}
	public int getAno() {
		return ano;
	}
	public int getOuro() {
		return qtdOuro;
	}
	public int getPrata() {
		return qtdPrata;
	}
	public int getBronze() {
		return qtdBronze;
	}
	
	// informações do páis campeão
	public void setNome1(String nomePais) {
		this.nomePais = nomePais;
	}
	public void setLink1(String link1) {
		this.link1 = link1;
	}
	public void setAno1(int ano1) {
		this.ano1 = ano1;
	}
	public void setOuro1(int qtdOuro1) {
		this.qtdOuro1 = qtdOuro1;
	}
	public void setPrata1(int qtdPrata1) {
		this.qtdPrata1 = qtdPrata1;
	}
	public void setBronze1(int qtdBronze1) {
		this.qtdBronze1 = qtdBronze1;
	}
	public String getNome1() {
		return nomePais;
	}
	public String getLink1() {
		return link1;
	}
	public int getAno1() {
		return ano1;
	}
	public int getOuro1() {
		return qtdOuro1;
	}
	public int getPrata1() {
		return qtdPrata1;
	}
	public int getBronze1() {
		return qtdBronze1;
	}
	
	// calculando a diferença
	public int diferencaOuro() {
		int diferencaOuro = qtdOuro1 - qtdOuro;
		return diferencaOuro;
	}
	public int diferencaPrata() {
		int diferencaPrata = qtdPrata1 - qtdPrata;
		return diferencaPrata;
	}
	public int diferencaBronze() {
		int diferencaBronze = qtdBronze1 - qtdBronze;
		return diferencaBronze;
	}
}