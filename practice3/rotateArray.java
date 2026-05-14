package practice3;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/rotate-array/description/

public class rotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = {1,2,3,4,5};
		
		rotate(arr, x);
		
		System.out.println(Arrays.toString(arr));
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void rotate(int[] arr, int x) {
		// [1,2,3,4,5] -1 rotation-> [5,1,2,3,4]
		
		// [5, 4, 3, 2, 1] ---> [5, 1, 2, 3, 4]
		
		int l = 0, r = arr.length-1;
		
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l+=1;
			r-=1;
		}
		
		l = x;
		r = arr.length-1;
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l+=1;
			r-=1;
		}
	}
}
