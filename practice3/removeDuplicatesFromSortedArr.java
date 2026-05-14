package practice3;

import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class removeDuplicatesFromSortedArr {
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
//		remove(arr);

		remove2(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void remove2(int[] arr) {
		int len = arr.length;
		int x = 1;
		// [0,1,2,3,4,2,2,3,3,4]
		//          x
		//                    i         
		for (int i = 1; i < len; i++) {
			if (arr[i] != arr[i-1]) {
				arr[x] = arr[i]; x++;
			}
		}
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void remove(int[] arr) {
		int len = arr.length;
		
		HashSet<Integer> mySet = new HashSet<>();
		
		for (int i = 0; i < len; i++) {
			mySet.add(arr[i]);
		}
		
		System.out.println(mySet);
		
	}
}














