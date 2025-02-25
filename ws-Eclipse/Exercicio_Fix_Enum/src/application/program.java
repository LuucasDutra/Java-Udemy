package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = (sc.nextLine());
		System.out.print("Email: ");
		String clientEmail = (sc.nextLine());
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(clientName, clientEmail, birthDate);
		
		System.out.print("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		Integer items = sc.nextInt();
		for (int i=0; i<items; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			Product product = new Product(productName, price);
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, price, product);
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
		
		
		
		sc.close();
	}

}
