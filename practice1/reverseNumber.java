package practice;

import java.util.Scanner;


// https://leetcode.com/problems/reverse-integer/description/

public class reverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int x = (int)sc.nextLong();

		// *-------------------*-------------------*-------------------*-------------------*
		
		int res = revNum(x);
		System.out.println("Reversed number: " + res);
		
		int g = 2147483412; // But, 3147483412 overflows 
		boolean check = (g <= Integer.MAX_VALUE);
		System.out.println("Does overflows: " + g + " [ " + check + " ] ");
		
//		
		// *-------------------*-------------------*-------------------*-------------------*
//		
//		int res = revNum2(x);
//		System.out.println("Reversed number: " + res);
//		
		
		// *-------------------*-------------------*-------------------*-------------------*
		
	}
	
	
	public static int revNum2(int x) {
		int res = 0;
		
		boolean isNeg = x < 0;
		
//		if (isNeg) x = -x; // Use this, if you are using Integer.toString(x), To remove the -ve sign 😊
		
//		String s = Integer.toString(x);
//		System.out.println("String: " + s);
		
		String s = String.valueOf(Math.abs(x));
		StringBuilder sb = new StringBuilder(s).reverse();
//		System.out.println("String: " + sb); 
		
		try {
			res = Integer.parseInt(sb.toString());
		} catch (NumberFormatException e) {
			return 0;
		}
		
		return isNeg ? -res: res;
	}
	
	public static int revNum(int x) {
		boolean isNeg = false;
		if (x < 0) {
			isNeg = true;
			x = -x;
		}
		int rev = 0;
		while (x > 0) {
			int n = x%10;
			
			System.out.println("before: " + rev  + " ( " + x); // use this with this example to visualize, -2147483412
			
			// rev * 10 + n >= Integer.MAX_VALUE
			// rev * 10     >= Integer.MAX_VALUE - n
			// rev          >=(Integer.MAX_VALUE - n / 10)
			if (rev > ((Integer.MAX_VALUE - n) / 10)) {
				System.out.println("here + " + rev);
				return 0;
			}
			
			System.out.println("after: " + rev + " ( " + x); // use this with this example to visualize, -2147483412
			
			
			System.out.println("what is x: " + x);
			
			
			x = x/10;
			rev = rev*10 + n;
		}
		if (isNeg) {
			rev = -rev;
		}
		return rev;
	}
}


// *---------------------*---------------------*---------------------*---------------------*

// Overflow

// Integer : 4 bytes ---> 32 bits

// 1234567890: Does not over-flow
// 9876543210: Does over-flow 😉

// *---------------------*---------------------*---------------------*---------------------*


