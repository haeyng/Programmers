import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [] arr = new int [n];

		for (int i = 0; i < n; i++) {						
			arr[i] = scanner.nextInt();		
		}

		int findNumber = scanner.nextInt();		
		int count = 0;
		
		for (int j = 0; j < n; j++) {
			if ((arr[j]) == findNumber) {count++;}			
		}
		System.out.println(count);
	}
}