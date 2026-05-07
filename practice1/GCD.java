package practice1;

import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		System.out.print("Enter y: " );
		int y = sc.nextInt();
		
		int res = calGCD(x,y);
		System.out.println("The result is: " + res);
	}
	
	public static int calGCD(int x, int y) {
		while (y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		return x;
	}}
