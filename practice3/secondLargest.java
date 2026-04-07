package practice3;

//https://www.geeksforgeeks.org/problems/second-largest3735/1

public class secondLargest {
	public static void main(String[] args) {
		int[] arr = {2, 0, 1, -2, -1};
		int len = arr.length;
		
//		int res = find(arr, len);
//		System.out.println(res);
		
		int res2 = findS(arr, len);
		System.out.println(res2);
	}
	
	
	public static int findS(int[] arr, int n) {
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			if (arr[i] < min) {
				secondMin = min;
				min = arr[i];
			}
			else if (arr[i] > min && arr[i] < secondMin) {
				secondMin = arr[i];
			}
		}
		return secondMin;
	}
	
	
	public static int find(int[] arr, int n) {
		int max = -1, secondMax = -1;
		
		for(int i = 0; i < n; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			else if (arr[i] < max && arr[i]>secondMax) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
}
