package practice2;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/sort-an-array/description/

public class bubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.print("Enter " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array: " + Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println("Array: " + Arrays.toString(arr));
		
		
		// Time Complexity of bubble-sort:
		// for i in range(0,n-1): (n-1)
		//		for j in range(0, n-2): (n-1)
		// 				
		// (n-1)*(n-1) --------------------> n^2 - 2n + 1;
		// Hence, O(n^2): Worst Case 😒
		// 	  omega(n): Best Case  😊 [If array is sorted(With early-exit-check 💡), Nested loop won't run, (n-1) --> O(n)✨]
	
	}
	
	// time complexity : O(n^2)💖
	// space complexity: O(1)✨
	public static void sort(int[] arr) {
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			boolean swapped = false;
			for (int j = 0; j < len-i-1; j++) {
				if (arr[j+1] < arr[j]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
	}
	
}













