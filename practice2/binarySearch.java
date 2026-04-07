package practice2;

//https://leetcode.com/problem-list/binary-search/

public class binarySearch {
	public static void main(String[] args) {
		int[] arr = {0,3,5,9,12};
		
//		int n = sol(arr, 9);
//		System.out.println("the res is: " + n);
		
		int x = r_sol(arr, 0, arr.length-1, 9);
		System.out.println("Index: " + x);
	}
	
	public static int sol(int[] arr, int target) {
		int n = arr.length;
		int l = 0, r = n-1;

		while (l <= r) {
			int m = (l+r)/2;
//			System.out.println("*: " + m);
			if (target == arr[m]) {
				return m;
			}
			else if (target < arr[m]) {
				r = m-1;
			} else {
				l = m+1;
			}
			l++;
			r--;
		}
		return -1;
	}
	
	public static int r_sol(int[] arr, int l, int r, int target) {
		if (l > r) {
			return -1;
		}
		int m = (l+r)/2;
		
		if (target == arr[m]) {
			return m;
		} else if (target < arr[m]) {
			return r_sol(arr, l, m-1, target);
		} else {
			return r_sol(arr, m+1, r, target);
		}
	}
}
