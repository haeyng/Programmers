import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
