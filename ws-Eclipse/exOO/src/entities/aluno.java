package entities;

public class aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double aprovado;
	public double reprovado;
	
	public double somaNota() {
		return nota1 + nota2 + nota3;
	}
	
	public String media() {
		if (somaNota() >= 60)  {
			return "PASS";
		} else {
			return "FAILED\nMissing " + String.format("%.2f", 60 - somaNota()) + " points.";
		}
	}
}
