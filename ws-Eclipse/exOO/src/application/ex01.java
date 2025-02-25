package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class ex01 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		rectangle x;
		x = new rectangle();
				
		System.out.println("Enter rectangle width and height: ");
		x.w = sc.nextDouble();
		x.h = sc.nextDouble();
		
		double area = x.area();
		double perimeter = x.perimeter();
		double diagonal = x.diagonal();
		
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Perimeter: %.2f%n", perimeter);
		System.out.printf("Diagonal: %.2f%n", diagonal);
		
		sc.close();
		
		
		
	}
}
