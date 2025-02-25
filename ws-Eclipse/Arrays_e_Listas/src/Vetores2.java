import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class Vetores2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		product[] vect = new product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect [i] = new product (name, price);
		}
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		double avg = soma / vect.length;
		System.out.printf("Average price = %.2f%n", avg);
		
		sc.close();
	}

}
