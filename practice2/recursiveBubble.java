package practice2;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/sort-an-array/description/

public class recursiveBubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,3,4,-1,2,34,100,0};
		int len = arr.length;
//		bubble(arr, len);
//		System.out.println("Result: " + Arrays.toString(arr));
//	
		rBubble(arr, arr.length);
		System.out.println("Result: " + Arrays.toString(arr));
	}
	
	// time complexity : O(n^2)💖
	// space complexity: O(n)✨
	public static void rBubble(int[] arr, int n) {
		if (n == 1) return;
		
		for (int i = 0; i < n-1; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		rBubble(arr, n-1);
	}
	
	// time complexity : O(n^2)💖
	// space complexity: O(1)✨
	public static void bubble(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
