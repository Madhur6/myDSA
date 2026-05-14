package practice1;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/count-primes/

public class countPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int res = solution(n);
		System.out.println("The number of primes: " + res);
	}
	
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int solution(int n) {
		// SIEVE OF ERATOSTHENES👀
		if (n < 2) {
			return 0;
		}
		
		boolean[] arr = new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		
		
		
		for (int i = 2; i*i < n+1; i++) {
			if (!arr[i]) {
				for (int j = i*i; j < n+1; j+=i) {
					arr[j] = true;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		int c = 0;
		for (int i = 0; i < n+1; i++) {
			if (!arr[i]) {
				c++;
			}
		}
		
		return c;
		
	}
}
