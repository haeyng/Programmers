import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int X = scanner.nextInt();
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int pay = scanner.nextInt();
			int num = scanner.nextInt();			
			sum += pay *num;
		}	
		System.out.println(sum == X ? "Yes" : "No");
	}
}
