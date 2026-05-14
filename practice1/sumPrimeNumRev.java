package practice1;

import java.util.Scanner;

// https://leetcode.com/problems/sum-of-primes-between-number-and-its-reverse/description/

public class sumPrimeNumRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int res = solution(n);
		System.out.println("The sum of primes between num & it's rev : " + res);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int solution(int x) {
		int rev = rev(x), s = 0, p = Math.min(x, rev), q = Math.max(rev, x);
		
		boolean[] arr = new boolean[q+1];
		
		arr[0] = true;
		arr[1] = true;
		
		for (int i = 2; i*i < q+1; i++) {
			if (!arr[i]) {
				for (int j = i*i; j < q+1; j+=i) {
					arr[j] = true;
				}
			}
		}
		
		for (int i = p; i < q+1; i++) {
			if (!arr[i]) {
				s+=i;
			}
		}
		return s;
	}
	
	// time complexity : O(log n)💖
	// space complexity: O(1)✨
	public static int rev(int x) {
		int rev = 0;
		while (x > 0) {
			int y = x % 10;
			rev = rev * 10 + y;
			x = x/10;
		}
		return rev;
	}
}
