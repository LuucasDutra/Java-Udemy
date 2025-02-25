package application;

import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class ex02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		funcionario func = new funcionario();
				
		System.out.printf("Name: ");
		func.name = sc.nextLine();
		System.out.printf("Gross salary: ");
		func.salary = sc.nextDouble();
		System.out.printf("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + func.name + ", $ " + String.format("%.2f", func.employee()));
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		func.increase = sc.nextDouble();
		System.out.println();
		System.out.println("Updated data: "+ func.name + ", $ " + String.format("%.2f",func.newSalary()));
		
		
		sc.close();
		
	}

}
