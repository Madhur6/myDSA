package practice3;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/

public class missingNumber {
	public static void main(String[] args) {
		int[] arr = {3,0,1};
		
		find(arr);
	}

	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find2(int[] arr) {
		int n = arr.length, s = 0;
		for (int i = 0; i < n; i++) {
			s += arr[i];
		}
		System.out.println((n*(n+1)/2) - s);

	}
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find(int[] arr) {
		int n = arr.length, s = 0, s1 = 0;
		for (int i = 0; i < n; i++) {
			s += i+1;
			s1 += arr[i];
		}
		System.out.println(s-s1);
	}
}
