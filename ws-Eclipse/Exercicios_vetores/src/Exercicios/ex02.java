package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.printf("Valores = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf(vect[i] + " ");
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		System.out.println();
		System.out.printf("Soma = %.2f%n", soma);

		double media = soma / n;
		System.out.printf("Media = %.2f%n", media);
		
		

	}

}
