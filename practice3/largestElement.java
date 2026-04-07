package practice3;

import java.util.Arrays;

public class largestElement {
	public static void main(String[] args) {
		int[] arr = {10,-2, 786, 0, 4, 3, 123, 78786, 9};
		int len = arr.length;
//		find(arr, len);

//		int res = findR(arr, len-1, 0);
//		System.out.println("Result: " + res);
		
		find3(arr, len);
	}
	
	public static void find3(int[] arr, int n) {
		Arrays.sort(arr);
		System.out.println("Result: " + arr[n-1]);
	}
	
	public static int findR(int[] arr, int n, int max) {
		if (n == 0) return max;
		
		if (arr[n] > max) {
			max = arr[n];
		}
		
		return findR(arr, n-1, max);
	}	
	
	public static void find(int[] arr, int n) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
