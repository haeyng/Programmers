import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if (B + C < 60) {				

			System.out.printf("%d %d", A , B + C);

		} else {
			
			A += (B + C) / 60;

			if (A == 24) {
				A = 0;
			}else if (A > 24) {
				A -= 24;
			}

			if ((B + C) % 60 == 0) {
				B = 0;				
			}else {
				B = (B + C) % 60;								
			}
			
			System.out.printf("%d %d", A, B);			
		}
	}
}
