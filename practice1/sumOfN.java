package practice1;

import java.util.Scanner;

// https://www.codechef.com/learn/course/recursion/LRECUR01/problems/RECUR02

public class sumOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: " );
		int n = sc.nextInt();
		
		int res = doSum(n);
		System.out.println("Sum is: " + res);
		

		int res2 = doSum2(n, 0);
		
		System.out.println("Sum is: " + res2);
		
		
		System.out.println("Result is: " + doSum3(n, 0));
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int doSum(int n) {
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		return res;
	}
	
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static int doSum2(int n, int sum) {
		if (n < 1) {
			return sum;
		}

		return doSum2(n-1, sum+n);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static int doSum3(int n, int sum) {
		
		// Iterative approach
//		int res = 0;
//		for (int i = 1; i <= n; i++) {
//			res += i;
//		}
//		return res;
		
		
		// Recurssive approach
		if (n < 1) {
			return sum;
		}

		return doSum3(n-1, sum+n);
	}
	
}

























