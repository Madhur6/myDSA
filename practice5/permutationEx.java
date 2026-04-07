package practice5;

import java.util.Scanner;

public class permutationEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();
		
		int res = fact(x);
		System.out.println("Permutation's result is: " + res);
	}
	
	public static int fact(int n) {
		// 4 p 2 ---> 4 * 3 * 2 * 1 / 2 * 1 ---> 12
		
		if (n == 1) {
			return 1;
		} else {
			return fact(n)*(n-1);
		}
	}
}
