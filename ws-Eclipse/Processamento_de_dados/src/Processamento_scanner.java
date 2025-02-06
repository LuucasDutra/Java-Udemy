import java.util.Scanner;

public class Processamento_scanner {

	public static void main(String[] args) {

		// LEITURA DE DADOS

//		Scanner sc = new Scanner (System.in);
//		
//		String x;
//		x = sc.next();
//		System.out.println("Voce digitou: " + x);

		// Ler numero

//		Scanner sc = new Scanner (System.in);
//				
//		int x;
//		x = sc.nextInt();
//		System.out.println("Voce digitou: " + x);

		// Ler Caractere

//		Scanner sc = new Scanner (System.in);
//		
//		char x;
//		x = sc.next().charAt(0);
//		System.out.println("Voce digitou: " + x);

		// Ler mais de uma variavel

//		Scanner sc = new Scanner(System.in);
//
//		String x;
//		int y;
//		double z;
//
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		System.out.println("Voce digitou: ");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		// Ler um texto até a quebra de linha
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		
		int x;
		x = sc.nextInt();
		sc.nextLine(); // Utilizado para consumir a quebra de linha do numero inteiro
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		
		System.out.println("Dados digitados: ");
		System.out.println(x);	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
