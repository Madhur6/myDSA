package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/sort-an-array/description/

public class mergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.print("Enter " + (i+1) + " element: ");
			arr[i] = sc.nextInt();
		}
		
//		merge(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		
		breaks(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
		// Time Complexity of Merge Sort
		// Recurrence:T(n) = 2T(n/2) + O(n) (divide array in half, merge results)
		// gives -> O(n log n) for all cases
		
		// Best Case: O(nlogn) 👀 [Even if array is reversed (worst-case)]
		// Merge process still runs for every level of recursion
		
		// Space comp: O(n) [temp array]

	}
	
	// time complexity : O(n log n)💖
	// space complexity: O(log n)✨
	public static void breaks(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l+r)/2;
			breaks(arr, l, m);
			breaks(arr, m+1, r);
			merges(arr, l, m, r);
		}
	}
	
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static void merges(int[] arr, int l, int m, int r) {
		int i = l, j = m+1;
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		while (i <= m && j <= r) {
			if (arr[i] < arr[j]) {
				temp.add(arr[i]);
				i++;
			} else {
				temp.add(arr[j]);
				j++;
			}
		}
		
		while (i <= m) {
			temp.add(arr[i]);i++;
		}
		while (j <= r) {
			temp.add(arr[j]);j++;
		}
		
		for (int s = l; s < r+1; s++) {
			arr[s] = temp.get(s-l);
		}
	}
	
	
	
	
	
	
	
	
	
	
	// time complexity : O(n log n)💖
	// space complexity: O(log n)✨
	public static void merge(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l+r)/2;
			merge(arr, l, m); // merge(arr, 0, 1) ---> m = 0 -> [10] [2] -> sort(arr, 0, 0, 1) -> 
			merge(arr, m+1, r); // merge(arr, 2,2)
			sort(arr, l, m, r); // merge(arr, 0, 1, 2)
		}
	}
	

	// [10,2,3]
	//   0 1 2
	
	// m = 1 -> [10,2] [3] 
	//			  0 1   0
	
	// temp = [2, 10] [3] -> sort(arr, 0, 1, 2) -> 
	//         0   1   0
	
	// temp = [2, 3, 10]
	
	// time complexity : O(n^2)💖
	// space complexity: O(1)✨
	public static void sort(int[] arr, int l, int m, int r) {
		// i = 0, j = 2, r = 2, m = 1
		int i = l, j = m+1;
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		// 0 <= 1 && 2 <= 2
		while (i <= m && j <= r) {
			if (arr[i] < arr[j]) {
				temp.add(arr[i]);
				i++;
			} else {
				temp.add(arr[j]);
				j++;
			}
		}
		// 0 <= 1
		while (i <= m) {
			temp.add(arr[i]);
			i++;
		}
		while (j <= r) {
			temp.add(arr[j]);
			j++;
		}
		
		

        // When you're working with a segment of the array (ex. l > 0), 
		// the indices in temp start from 0, while the segment in arr starts from l.

        // For example:

        // Array: arr = [3, 8, 1, 4]
        // Merge process for a segment with l = 2, m = 2, r = 3:
        // Segment: arr[2:4] = [1, 4]
        // Temporary array (temp) after merging: temp = [1, 4].
        // Now, when copying back to arr:

        // s = 2 → Index in temp = s - l = 2 - 2 = 0 → arr[2] = temp.get(0)
        // s = 3 → Index in temp = s - l = 3 - 2 = 1 → arr[3] = temp.get(1)
        // If you didn’t subtract l, you’d incorrectly access temp.get(2) (out of bounds).

		for (int s = l; s < r+1; s++) {
			arr[s] = temp.get(s-l);
		}
	}
}

// [10,2,3,4,6]
//   0 1 2 3 4
// m = 2
// [10,2,3]   [4,6]
//   0 1 2     0 1


















