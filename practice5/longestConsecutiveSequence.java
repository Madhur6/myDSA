package practice5;

import java.util.Arrays;

//https://neetcode.io/problems/longest-consecutive-sequence
//https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1



// SubSequence->
// You can:
// keep elements 🧺
// skip elements 🦘
// But you cannot change the order.❌

// Ex. ABCDEF -> Possible subsequences: ACE / ADF / ABF / ABCDEF / A



public class longestConsecutiveSequence {
	public static void main(String[] args) {
		int[] arr = {2,20,4,10,3,4,5};
		find(arr);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find(int[] arr) {
		int n = arr.length, length = 1, max = Integer.MIN_VALUE;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i-1]+1) {
				length++;
			} else if (arr[i] == arr[i-1]) {
				continue;
			} else {
				length=1;
			}
			max = Math.max(max, length);
		}
		System.out.println(max);
	}
	
}
