package practice4;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/maximum-sub-array5443/1

public class PrintMaxSubArrSum2 {
	public static void main(String[] args) {
		int[] arr = {-71, 92, 0, 67, -8, 67, -78, -7};
		
		int n = arr.length;
		
		find(arr, n);
	}
	
	public static void find(int[] arr, int n) {
		ArrayList<Integer> res = new ArrayList<>();
		int max = Integer.MIN_VALUE, sum = 0;
		int s = -1, e = -1;
		int i = 0, j = 0;
		while (i < n) {
			if (arr[j] < 0) {
				sum-=arr[j];j++;
			}
			if (i < n-1 && j < n-1 && arr[i] < 0) {
				i++;
				j = i;
				sum = arr[i];
			} else {
				sum += arr[i];
			}
			
			if (sum >= max) {
				max = sum;
				
				s = j;
				e = i;
			}
			i++;
		}
		if (s >  e) {
			res.clear();
			res.add(-1);
		}
		for (int p = s; p <= e; p++) {
			res.add(arr[p]);
		}
		
		System.out.println(res);
	}
}
