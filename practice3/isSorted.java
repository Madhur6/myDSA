package practice3;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

public class isSorted {
	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 2, 4};
		
//		boolean res = find2(arr);
//		System.out.println(res);

		boolean res = find3(arr);
		System.out.println(res);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static boolean find3(int[] arr) {
		int len = arr.length;
		int c = 0;
		
		for (int i = 1; i < len; i++) {
			if (arr[i] < arr[i-1]) {
				c++;
			}
		}
		
		if (arr[len-1] > arr[0]) {
			c++;
		}
		
		if (c > 1) { // Rotated sorted arrays have exactly 1 break-point.😊
			return false;
		} else {
			return true;
		}
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static boolean find1(int[] arr) {
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			if (i < len && arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static boolean find2(int[] arr) {
		int len = arr.length;
		
		for (int i = 0; i < len/2; i++) {
			if (i < len && arr[i] > arr[i+1] && arr[len-1-i] < arr[len-1-i-1]) {
				return false;
			}
		}
		return true;
	}
	
	
}























