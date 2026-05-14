package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


//https://www.geeksforgeeks.org/problems/reverse-an-array/1


// [1,2,3,4,5,6,7] ---------> [7,6,5,4,3,2,1]


public class reverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}
		
		
//		System.out.println("Array: " + Arrays.toString(arr));
//		
//		int[] arr2 = reverseArr(arr);
//		
//		System.out.println("Array: " + Arrays.toString(arr2));
//		
//		
//		reverseArr2(arr2);
//		
//		System.out.println("Array: " + Arrays.toString(arr2));
		

		reverseArr3(arr, 0, arr.length-1);
		
		System.out.println("Array: " + Arrays.toString(arr));
		
		
	}
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static void reverseArr3(int[] arr, int start, int end) {
		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArr3(arr, start+1, end-1);
		}
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void reverseArr2(int[] arr) {
//		int n = arr.length-1;
//		int l = 0, r = n;
//		
//		for (int i = 0; i <= n/2; i++) {
//			int temp = arr[n-i];
//			arr[n-i] = arr[i];
//			arr[i] = temp;
//		}
		
//		ArrayList<Integer> myarr = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
//		myarr.reversed();
	}
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static int[] reverseArr(int[] arr) {
		int[] newArr = new int[arr.length];
		
		for (int i = arr.length-1; i >= 0; i--) {
			newArr[arr.length-1 - i] = arr[i];
		}
		return newArr;
	}
}








