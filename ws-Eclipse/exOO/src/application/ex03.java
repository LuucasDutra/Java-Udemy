package application;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;

public class ex03 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		aluno aluno = new aluno();
		
		System.out.printf("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite as notas do aluno: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Final grade = " + String.format("%.2f", aluno.somaNota()));
		System.out.println(aluno.media());
		
		sc.close();
	}
}
