package practice1;

import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1

public class printUsingRecurssion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int n = sc.nextInt();
		
		// print anything
		printRecursive();
		
		// print 1 to n
		print1ToN(n);
		
		System.out.println();
		
		
		// print n to 1
		printNTo1(n);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static void print1ToN(int n) {
		// base case
		if (n < 1) return;
		
		// recursive case
		print1ToN(n-1);
		System.out.print(n + " ");
	}
	
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static void printNTo1(int n) {
		if (n < 1) return;
		System.out.print(n + " ");
		printNTo1(n-1);	
	}
	
	
	// time complexity : O(1)💖
	// space complexity: O(1)✨
	public static void printRecursive() {
		System.out.println("Recurssion!");
		printRecursive();
	}
}


