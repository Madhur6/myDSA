package practice2;

import java.util.Arrays;
import java.util.Scanner;


// https://www.naukri.com/code360/problems/k-most-occurrent-numbers_625382https://www.naukri.com/code360/problems/k-most-occurrent-numbers_625382

public class rInsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,3,54,67,1,-1,23,0};
//		
//		sort(arr);
//		System.out.println("Array: " + Arrays.toString(arr));
//		
		rSort(arr, arr.length-1);
		System.out.println("Array: " + Arrays.toString(arr));
	}
	
	// time complexity : O(n^2)💖
	// space complexity: O(n)✨
	public static void rSort(int[] arr, int n) {
		if (n == 0)return;
		
		rSort(arr, n-1);
		
		int key = arr[n];
		int j = n-1;
		
		while (j >= 0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j = j-1;
		}
		arr[j+1] = key;
	}
	
	// time complexity : O(n^2)💖
	// space complexity: O(1)✨
	public static void sort(int[] arr) {
		int len = arr.length;
		
		for (int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i-1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	
	
}
