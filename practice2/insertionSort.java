package practice2;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/sort-an-array/description/

public class insertionSort {
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
		
		
		// time complexity of Insertion-sort
		// outer-loop: (n-1) iterations
		// inner-loop: compares & shifts [(n-1), (n-2), ...., 1 elements]
		// Total comparisons in worst-case: n*(n-1)/2 ------> O(n^2) comparisons [In worst-case, compares & shifts [(n-1), (n-2), ...., 1 elemens]]
		
		// Hence, O(n^2): worst case 😒
		// 		  O(n): best case 😊 (array already sorted, Hence (n-1))
		//        O(n^2): avg case
		
		// Space-comp: O(1) [in-place sorting]
	}
	
	public static void sort(int[] arr) {
		int len = arr.length;
		
		for(int i = 1; i < len; i++) {
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





