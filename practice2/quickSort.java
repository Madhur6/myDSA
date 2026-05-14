package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/sort-an-array/description/

public class quickSort {
	public static void main(String[] args) {
		Integer[] arr2 = {10, -1, 30, 45, 345, -2344, 1, 2, 6, 5, 4};
		List<Integer> arr = Arrays.asList(arr2);
		
		quickSort(arr, 0, arr.size()-1);
		
		System.out.println("Array: " + arr);
	}
	
	// time complexity : O(n log n)💖
	// space complexity: O(log n)✨
	public static void quickSort(List<Integer> arr, int s, int e) {
		if (s < e) {
			int p = Partition2(arr, s, e); // try either: Partition or Partition2
			quickSort(arr, s, p-1);
			quickSort(arr, p+1, e);
		}
	}
	
	// [10, 2, 5, 7, 1, 3] -> pivot = 2 / pIndex = 2 / for (0 - 5) / if (10 <= 3) / swap | if (2 <= 3)
	// [2, 10, 5, 7, 1, 3] -> if (5 <= 3) | if (7 <= 3) | if (1 <= 3)
	// [2, 1, 5, 7, 10, 3] -> if ()
	
	// [2, 1, 3, 5, 7, 10]
	
	
	// [10, 5, 6, 3, 2, 16, 4]
	// pivot = 4
	// pindex = 2
	
	// for (0,6) -> if (10 < 4) | if (5 / 6 < 4) | if (3 < 4) -> swap [3, 5, 6, 10, 2, 16, 4]
	// -> if (2 < 4) -> swap [3, 2, 6, 10, 5, 16, 4]
	
	// -> outer swap -> [3, 2, 4, 10, 5, 16, 6]
	
	// [3, 2]                [10, 5, 16, 6]
	//  0  1
	
	// pivot = 2
	// pindex = 0
	
	// for (0, 1) -> if (3 < 2) -> outerswap -> [2, 3]
	
	
	// [10, 5, 15, 6]
	//  0   1   2  3
	// pivot = 6
	// pindex = 1
	
	// for (0, 3) -> if (10 < 6) -> if (5, 6) -> swap [5, 10, 15, 6] -> outerswap [5, 6, 15, 10]
	
	// [5] [15, 10] -> [10, 15]
	// [2, 3, 4, 5, 6, 10, 15]
	
	// Time Complexity of Quick Sort
	// Partition: O(n) for each call
	// Recurrence: T(n) = T(k) + T(n-k-1) + O(n) (k depends on pivot position)
	// Worst case: O(n^2) 😒 (pivot always at smallest/largest position, occurs if array is sorted and bad pivot choice)
	// Best Case: O(nlogn) 😊 (pivot always splits array evenly)
	
	// Space Comp: O(logn) 😊 (Better than merge-sort)
	// good pivot selection: median of 3 [n+1/2] / random pivot (Reduces the chances of worst-case)
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int Partition(List<Integer> arr, int s, int e) {
		int pivot = arr.get(e);
		int pIndex = s;
		
		for (int i = s; i <= e; i++) {
			if (arr.get(i) < pivot) {
				// swap
				int temp = arr.get(i);
				arr.set(i, arr.get(pIndex));
				arr.set(pIndex, temp);
				pIndex++;
			}
		}
		// swap
		int temp = arr.get(e);
		arr.set(e, arr.get(pIndex));
		arr.set(pIndex, temp);
		
		return pIndex;
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int Partition2(List<Integer> arr, int s, int e) {
		int pivot = arr.get(s);
		int pIndex = s;
		
		for (int i = s; i <= e; i++) {
			if (arr.get(i) < pivot) {
				pIndex++;
				// swap
				int temp = arr.get(i);
				arr.set(i, arr.get(pIndex));
				arr.set(pIndex, temp);
			}
		}
		// swap
		int temp = arr.get(s);
		arr.set(s, arr.get(pIndex));
		arr.set(pIndex, temp);
		
		return pIndex;
	}
}









