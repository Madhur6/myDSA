package practice;

import java.util.Scanner;

// https://leetcode.com/problems/palindrome-number/description/

public class checkPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
//		boolean res = check1(x); // O(depends upon how much time all the pre-defined java methods takes)
//		System.out.println("The res: " + res);

		// *-------------------*-------------------*-------------------*-------------------*

//		boolean res = check2(x); // O(logn)
//		System.out.println("The res: " + res);

		// *-------------------*-------------------*-------------------*-------------------*
		boolean res = check3(x); // O(n)
		System.out.println("The res: " + res);
	}
	
	public static boolean check3(int x) {
		if (x < 0) return false;
		
		String y = Integer.toString(x);
		
		int l = 0, r = y.length()-1;
		while (l < r) {
			if (y.charAt(l) != y.charAt(r)) return false;
			
			l+=1;
			r-=1;
		}
		return true;	
	}
	
	public static boolean check2(int x) {
		if (x < 0) {
			return false;
		}
		int original = x, rev = 0;
		while (x > 0) {
			int n = x % 10;
			x /= 10;
			rev = rev * 10 + n;
		}
		return original == rev;
	}
	
	public static boolean check1(int x) {
		if (x < 0) {
			return false;
		}
		
		String s = Integer.toString(x);
		StringBuilder sb = new StringBuilder(s).reverse();
		
		if (s.equals(sb.toString())) {
			return true;
		} else {
			return false;
		}
	}
}
