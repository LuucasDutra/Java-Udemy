import java.util.Scanner;

public class ex01_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
			// Ex01
//		int x = 0;
//		
//		while (x != 2002) {
//			x = sc.nextInt();
//			System.out.println("Senha invalida");
//		}
//		System.out.println("Acesso permitido");
//		sc.close();
			// EX02
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		while (x != 0 && y != 0) {
//			if (x > 0 && y > 0) {
//				System.out.println("primeiro");
//			}
//			else if (x < 0 && y > 0) {
//				System.out.println("segundo");
//			}
//			else if (x < 0 && y < 0) {
//				System.out.println("terceiro");
//			}
//			else {
//				System.out.println("quarto");
//			}
//			x = sc.nextInt();
//			y = sc.nextInt();
//		}
//		
//		sc.close();
			
		
			//EX03
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}
}