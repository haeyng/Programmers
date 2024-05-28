import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if ( H == 0) {
			
			if (M - 45 < 0) {
				
				H = 23;
				M = M - 45 + 60;
				
				System.out.printf("%d %d", H, M);
				
			} else {

				H = 0;
				M = M - 45;
				System.out.printf("%d %d", H, M);
				
			}
			
			
		} else {

			if (M - 45 < 0) {	
				
				H = H - 1;
				M = M - 45 + 60;

				System.out.printf("%d %d", H, M);
				
			} else {
				
				M = M - 45;

				System.out.printf("%d %d", H, M);			
			}		
		}
	}
}
