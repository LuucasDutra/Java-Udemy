import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class membrosEstaticos {


		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calculator.circumference(radius);
		
		double v = calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI);
		
	sc.close();
	}
}
