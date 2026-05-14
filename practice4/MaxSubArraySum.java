package practice4;


// https://leetcode.com/problems/maximum-subarray/

public class MaxSubArraySum {
	public static void main(String[] args) {
		int[] arr = {-71, 92, 0, 67, -8, 67, -78, -7};
		int n = arr.length;
		find4(arr, n);
	}
	
	// divide and conquer approach, which is more subtle. O(nlogn)
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find5(int[] arr, int n) {
		int s = helper(arr, 0, arr.length-1);
		System.out.println("Max. sub array sum: " + s);
	}
	
	// time complexity : O(n log n)💖
	// space complexity: O(log n)✨
	public static int helper(int[] arr, int l, int r) {
		if (l == r) {
			return arr[l];
		}
		
		int mid = (l + r)/2;
		
		int lss = helper(arr, l, mid);
		int rss = helper(arr, mid+1, r);
		int css = crossSum(arr, l, mid, r);
		
		return Math.max(Math.max(lss, rss), css);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int crossSum(int[] arr, int l, int m, int r) {
		int s = 0;
		
		int ls = Integer.MIN_VALUE;
		for (int i = m; i >= l; i--) {
			s += arr[i];
			ls = Math.max(ls, s);
		}
		s = 0;
		int rs = Integer.MIN_VALUE;
		for (int i = m+1; i <= r; i++) {
			s += arr[i];
			rs = Math.max(s, rs);
		}
		
		return ls + rs;
	}
	
	// Kadane's Algorithm 🧙‍♂️ (Print the SubArrays)
	// If we want to print the sub-array
	// If we carefully observe, Our sub-array's starting-idx is where the sum is 0 &
	// ending index, the index where sum exceeds the prev-max.
	
	
	// [5,4,-1,7,8]
	//  0 1  2 3 4 
	//  i
	// max = 9
	// s   = 9
	// start = 0, s = 0, e = 1;
	// op  = 23
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find4(int[] arr,int n) {
		int max = Integer.MIN_VALUE, sum = 0, start = -1, s = -1, e = -1;
		for (int i = 0; i < n; i++) {
			if (sum == 0) {
				start = i;
			}
			
			sum += arr[i];
			
			if (sum > max) {
				max = sum;
				
				// Intution ✨
				s = start;
				e = i;
			}
			
			if (sum < 0) {
				sum = 0;
			}
		}
		
		for (int i = s; i <= e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// Kadane's Algorithm 🧙‍♂️
	// We do not consider -ve sum
	// Edge case 📖:
	//	- {-1, -4, -5}
	// 		0   1   2
	//      i
	//  sum = -5
	//  max = -1 (returns this✨ -> Incorrect😑)
	
	
	// [5,4,-1,7,8]
	//  0 1  2 3 4 
	//  i
	// max = 23
	// s   = 23
	// op  = 23
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find3(int[] arr, int n) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			
			if (sum > max) {
				max = sum;
			}
			
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(max);
		
		// Edge case 📖:
		// 	-If empty subArray Sum is considered ?
		// System.out.println(Math.max(0, max));
	}
	
	// If we need to find the sum of current-sub-array
	// We just need to add the current element to the previous subArray sum
	// -> sumOfSubArr[i,j] = sumOfSubArr[i,j-1] + arr[j]
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find2(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int s = 0;
			for (int j = i; j < n; j++) {
				s += arr[j];
				
				max = Math.max(s, max);
			}
		}
		System.out.println(max);
	}
	
	// NOT REALLY EFFICIENT 😑
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		// -2,1,-3,4,-1,2,1,-5,4
		//  i
		//         j
		//         k
		//  s = -2 + 1
		//  m = 0
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int s = 0;
				for (int k = i; k <= j; k++) {
					s += arr[k];
				}
				max = Math.max(s, max);
			}
		}
		System.out.println(max);
	}
}
