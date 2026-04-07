package practice2;

import java.util.Arrays;
import java.util.Scanner;


//https://leetcode.com/problems/sort-an-array/description/

public class selectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = new int[x]; // We are copying from right to left
		for (int i = 0; i < x; i++) {
			System.out.print("Enter " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array: " + Arrays.toString(arr));
		
		sort(arr);
	
		System.out.println("Array: " + Arrays.toString(arr));
		
		
		sort2(arr);
		
		System.out.println("Array: " + Arrays.toString(arr));
		
		
		// Time Complexity of selection-sort:
		// no of comparisons: (n-1) + (n-2) + (n-3) + ..... + 1
		// 				A.P : n(n-1)/2 --------------------> (n^2 - n)/2
		// Hence, O(n^2): Worst Case 😒
		// 	  omega(n^2): Best Case  😊 [because it still performs all the comparisons(even if array is sorted), Even if the 
		// 			algorithm finds smallest number like 0, It will still look for 
		//   		the rest of the array, Just in case, If there's a -ve number]
	
	}
	
	public static void sort2(int[] arr) {
		int len = arr.length;
		for (int i = 0; i <len; i++) {
			int maxIdx = i;
			for (int j = i; j < len; j++) {
				if (arr[j] > maxIdx) {
					maxIdx = j;
				}
			}
			// SWAP
			int temp = arr[i];
			arr[i] = arr[maxIdx];
			arr[maxIdx] = temp;
		}
	}
	
	public static void sort(int[] arr) {
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			int minIdx = i;
			for (int j = i+1; j < len; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			// SWAP
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
	}
}























