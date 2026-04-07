package practice3;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/submissions/1927515466/

public class twoSum {
	
	static class Pair implements Comparable<Pair>{
		int idx, val;
		Pair(int idx, int val){
			this.idx = idx;
			this.val = val;
		}
		
		@Override
		public int compareTo(Pair other) {
			return Integer.compare(this.val, other.val);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 6, 5, 8, 11};
		int k = 14, n = arr.length;
		
//		int[] res = find(arr, n, k);
//		System.out.println(Arrays.toString(res));
		
		
		int[] res = find2(arr, k);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] find2(int[] arr, int target) {
		int n = arr.length;
		
		Pair[] pairs = new Pair[n];

		for (int i = 0; i < n; i++) {
			pairs[i] = new Pair(i, arr[i]);
		}
		Arrays.sort(pairs);
		for (Pair p:pairs) {
			System.out.println(p.idx + " " + p.val);
		}
		
		int l = 0, r = n-1, sum = 0;
		int[] res = new int[2];
		while (l < r) {
			sum = pairs[l].val + pairs[r].val;
			if (sum < target) {
				l+=1;
			} else if (sum > target) {
				r-=1;
			} else {
				res[0] = pairs[l].idx;
				res[1] = pairs[r].idx;
				break;
			}
		}
		return res;
	}

	
	public static int[] find(int[] arr, int n, int k) {
		int[] res = new int[2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] + arr[j] == k) {
					res[0] = j;
					res[1] = i;
				}
			}
		}
		return res;
	}
	
	
}
