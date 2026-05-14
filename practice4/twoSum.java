package practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//https://leetcode.com/problems/two-sum/submissions/1927515466/


public class twoSum {
	
	static class Pair implements Comparable<Pair>{
		public int idx;
		public int val;
		
		// time complexity : O(n)💖
		// space complexity: O(1)✨
		public Pair(int idx, int val) {
			this.val = val;
			this.idx = idx;
		}
		
		@Override
		// time complexity : O(1)💖
		// space complexity: O(1)✨
		public int compareTo(Pair other) {
			return Integer.compare(this.val, other.val);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int k = 9;
		
		int[] res = find(arr, arr.length, k);
		System.out.println("The resultant array is: " + Arrays.toString(res));
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int[] find(int[] arr, int n, int target) {
		List<Integer> lit = new ArrayList<>();
		Pair[] pairs = new Pair[n];
		for (int i = 0; i < n; i++) {
			pairs[i] = new Pair(i, arr[i]);
		}
		int[] res = new int[2];
		
		int l = 0, r = n-1, s = 0;
		while (l < r) {
			s = pairs[l].val + pairs[r].val;
			
			if (s > target) {
				r-=1;
			} else if (s < target) {
				l+=1;
			} else {
				res[0] = pairs[l].idx;
				res[1] = pairs[r].idx;
				break;
			}
		}
		return res;
	}
}
