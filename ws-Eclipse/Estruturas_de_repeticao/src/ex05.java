import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			float n1 = sc.nextInt();
			float n2 = sc.nextInt();
			if (n2 == 0) {
				System.out.println("Divisao impossivel");
			} else {
				double divisao = (double) n1 / n2;
				System.out.printf("%.1f%n", divisao);
			}
			
		}
		sc.close();
	}

}
