package practice4;

import java.util.ArrayList;

public class PrintMaxSubArrSum {
	public static void main(String[] args) {
		int[] arr = {-71, 92, 0, 67, -8, 67, -78, -7};
		
		int n = arr.length;
		
		find(arr, n);
	}
	
	public static void find(int[] arr, int n) {
		ArrayList<Integer> res = new ArrayList<>();
		
		int max = Integer.MIN_VALUE, sum = 0, start = 0, s = -1, e = -1;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				continue;
			}
			
			if (sum == 0) {
				start = i;
			}
			
			sum += arr[i];
			
			if (sum < 0) {
				sum = 0;
			}
			
			if (sum > max) {
				max = sum;
				
				s = start;
				e = i;
			}
		}
		
		for (int i = s; i <= e; i++) {
			res.add(arr[i]);
		}
		
		System.out.println(res);
	}
}
