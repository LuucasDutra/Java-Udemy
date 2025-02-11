import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int n = -1;
		
		for (int i=0; i < x ;i = i+2) {
			n = n + 2;
			System.out.println(n);
			
		}
			sc.close();
	}

}
