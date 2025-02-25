package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import Entities.entities03;

public class ex03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		entities03[] vect = new entities03[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.printf("Nome: ");
			String nome = sc.next();
			System.out.printf("Idade: ");
			int idade = sc.nextInt();
			System.out.printf("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new entities03(nome, idade, altura);
		}

		double altura = 0.0;
		for (int i = 0; i < vect.length; i++) {
			altura += vect[i].getAltura();
		}
		double mediaAltura = altura / n;
		System.out.println();
		System.out.printf("Altura média = %.1f%n", mediaAltura, "%");

		int contadorMenorIdade = 0;
		for (int i=0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				contadorMenorIdade++;
			}
		}
		double percentualMenorIdade = ((double)contadorMenorIdade / n) * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentualMenorIdade, "%");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
	}

}
