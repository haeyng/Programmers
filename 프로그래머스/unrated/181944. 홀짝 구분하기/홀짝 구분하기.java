import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n%2) {
		case 0:
			System.out.printf("%d is even", n);
			break;
		default:
			System.out.printf("%d is odd", n);
			break;
		}//switch
    }
}