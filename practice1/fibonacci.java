package practice1;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/fibonacci-number/description/

public class fibonacci {
	
	private static int[] memo;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = fab(x);
		System.out.println("Array: " + Arrays.toString(arr));
		
		
		memo = new int[x+1];
		int res = fab2(x);
		System.out.println("The result is: " + res);
	}
	
//	public static int fab2(int x) {
//		if (x == 0) {
//			return 0;
//		} else if (x == 1) {
//			return 1;
//		}
//		
//		if (memo[x]!=0) {
//			return memo[x];
//		}
//		memo[x] = fab2(x-2) + fab2(x-1);
//		return memo[x];
//	}
	
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int fab2(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		}
		
		if (memo[x] != 0) {
			return memo[x];
		}
		memo[x] = fab2(x-2)+fab2(x-1);
		return memo[x];
	}
	

	 
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static int[] fab(int x) {
		int[] res = new int[x+1];
		
		int a = 0, b = 1;
		
		for (int i = 0; i <= x; i++) {
			res[i] = a;
			int temp = a + b;
			a = b;
			b = temp;
		}
		return res;
	}
	
	// time complexity : O(1)💖
	// space complexity: O(1)✨
	public static int checkFib(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return checkFib(x-2) + checkFib(x-1);
		}
	}
}
