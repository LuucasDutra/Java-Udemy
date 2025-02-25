package application;

import java.util.Locale;
import java.util.Scanner;

import entities.entitiesEx01;

public class ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		entitiesEx01 entities = new entitiesEx01();

		System.out.print("Enter account number: ");
		entities.number = sc.nextInt();

		System.out.print("Enter account holder: ");
		entities.name = sc.next();

		System.out.print("Is there an inicital deposity (y/n)? ");
		entities.initialDeposit = sc.next();

		if (entities.initialDeposit.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			entities.deposit = sc.nextDouble();
		} else {
			System.out.println();
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println( entities.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		entities.deposit2 = sc.nextDouble();
		System.out.println("Updated account data: ");
		System.out.println( entities.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		entities.withdraw = sc.nextDouble();
		System.out.println("Updated account data: ");
		System.out.println( entities.toString2());
	

		
		sc.close();
	}

}
