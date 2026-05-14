package practice4;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/maximum-sub-array5443/1


// Why Kadane is better? ✨😌
// Because the array can contain:👀
// - positive numbers
// - negative numbers
// - mixed values
//
// Sliding window does not work reliably when negatives exist


public class PrintMaxSubArrSum {
	public static void main(String[] args) {
		
		// Mixed positive + negative numbers
		int[] arr1 = {-71, 92, 0, 67, -8, 67, -78, -7};
		
		// Edge case:
		// Entire array is non-negative,
		// so the whole array becomes the answer.
		
		// To include the last index:
		// (sum == max && (i-start > q-p))
		int[] arr2 = {206, 20, 789, 184, 853, 948, 822, 0};
		
		// Edge case:
		// Same maximum sum possible from multiple subarrays.
		// Need to prefer:
		// 1. Larger length
		// 2. Smaller starting index if lengths are equal
		//
		// Example:
		// [1,2,3] and [3,2,1]
		//
		// Tie-breaking handled using:
		// (sum == max && (i-start == q-p) && start < p)
		int[] arr3 = {1, 2, 3, -2, 3, 2, 1};
		
		
		// To handle this,
		// 		if (p == -1) {array.add(-1);return array;}
		int[] arr4 = {-1,-1};
		
		ArrayList<Integer> array = findSubarray(arr2);
		System.out.print(array);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static ArrayList<Integer> findSubarray(int arr[]) {
		ArrayList<Integer> array = new ArrayList<>();
		
		int n = arr.length, max = Integer.MIN_VALUE, sum = 0, start = -1, p = -1, q = -1;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				sum = 0;
				if (i+1 < n) {
					start = i+1;
				}
				continue;
			}
			
			if (sum == 0) {
				start = i;
			}
			
			sum += arr[i];
			
			if (sum > max || (sum == max && (i-start > q-p)) || (sum == max && (i-start == q-p) && start < p)) {
				max = sum;
				
				p = start;
				q = i;
			}
			
			if (sum < 0) {
				sum = 0;
			}
		}
		
		if (p == -1) {
			array.add(-1);
			return array;
		}
		
		for (int i = p; i <= q; i++) {
			array.add(arr[i]);
		}
		return array;
	}
}
