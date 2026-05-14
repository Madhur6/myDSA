package practice1;

import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/small-factorial0854/1?selectedLang=java

public class factorialEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int res = fact(x);
		System.out.println("The factorial of " + x + " is: " + res);
		
		int res2 = factRecurssive(x);
		System.out.println("The factorial of " + x + " is: " + res);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static int factRecurssive(int x) {
		if (x == 1) {
			return 1;
		}
		return x*fact(x-1);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int fact(int x) {
		int res = 1;
		while (x > 0) {
			res = res * x; 
			x-=1;
		}
		return res;
	}
}
