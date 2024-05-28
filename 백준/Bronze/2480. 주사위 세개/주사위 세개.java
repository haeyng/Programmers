import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if (A == B && B == C && A == C) {
			
			System.out.println(10000 + A * 1000);
			
		} else if ((A == B && B != C ) || (B == C && A != C) || (A == C && B != C)) {

				System.out.println((A==B)? 1000 + A * 100:1000 + C*100);

		} else if (A != B && B != C && A != C) {
			
			System.out.println(Math.max(Math.max(A,B),C)*100);					
		}
	}
}
