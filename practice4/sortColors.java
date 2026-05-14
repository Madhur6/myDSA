package practice4;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/description/

public class sortColors {
	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		int n = arr.length;
		find(arr, n);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find(int[] arr, int n) {
		// [0, 0, 1, 1, 2, 2]
		//  l              h
		//  m
		// [0, 0,          2]
		// Dutch National Flag Algorithm (Netherlands)🍎🥛🧙‍♂️
		int l = 0, m = 0, h = n-1;
		while (m <= h) {
			if (arr[m] == 0) {
				// swap
				int temp = arr[l];
				arr[l] = arr[m];
				arr[m] = temp;
				l++;m++;
			} else if (arr[m] == 1) {
				m++;
			} else {
				// swap
				int temp = arr[m];arr[m] = arr[h];arr[h] = temp;h--;
			}
		}
		System.out.println(Arrays.toString(arr) + " " + m);
	}
}
















