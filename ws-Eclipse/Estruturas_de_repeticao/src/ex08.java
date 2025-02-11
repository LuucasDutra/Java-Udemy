import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int quad = i * i;
			int cubo = i * i * i;

			System.out.printf("%d %d %d%n", i, quad, cubo);

		}
		sc.close();
	}

}
