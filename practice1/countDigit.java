package practice1;

import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/count-digits-1606889545/1

public class countDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int res = countDigit2(num);
		System.out.println("The result: " + res);	
	}
	
	// time complexity : O(log n)💖
	// space complexity: O(1)✨
	public static int countDigit(int x) {
		if (x == 0) return 1;
		if (x < 0) {
			x = -x;
		}
		
		int counter = 0;
		while (x > 0) {
			x = x/10;
			counter+=1;
		}
		return counter;
	}
	
	
	// time complexity : O(1)💖
	// space complexity: O(1)✨
	public static int countDigit2(int x) {
		int z = (int) Math.log10(x)+1;
		return z;
	}
}























