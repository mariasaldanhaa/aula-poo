package Entidade;

public class Aluno {
	private String nome;
	private String matricula;
	private double nota;
	
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNome (String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("\nERRO: Nome não pode ser vazio!");
		}
	}
		
	public void setMatricula (String matricula) {
		if (matricula != null && !matricula.trim().isEmpty()) { 
			// ! - negação (inverte o resultado)
			// trim - remove os espaços vazios do inicio e fim
			// dá true para NÃO vazio
			this.matricula = matricula;
		} else {
			throw new IllegalArgumentException("\nERRO: Matrícula não pode ser vazio!");
		}
	}
	
	public void setNota (double nota) {
		if (nota >= 0 && nota <= 100) {
			this.nota = nota;
		} else {
			throw new IllegalArgumentException("\nERRO: Nota não pode ser negativo!");
		}
	}
}