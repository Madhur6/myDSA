package practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// https://leetcode.com/problems/4sum/description/

public class fourSum {
	public static void main(String[] args) {
		int[] arr = {1000000000,1000000000,1000000000,1000000000};
		int n = arr.length, target = -294967296;
		find(arr, n, target);
	}
	
	
	// Recurssive Approach✨
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static List<List<Integer>> find2(int[] arr, int n, int target) {
		Arrays.sort(arr);
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> quad = new ArrayList<>();
		
		kSum(4, 0, (long)target, arr, res, quad);
		
		return res;
	}
	
	// time complexity : O(n^(k-1))💖
	// space complexity: O(k)✨
	public static void kSum(int k, int start, long target, int[] arr, List<List<Integer>> res, List<Integer> quad) {
		if (k != 2) {
			for (int i = start; i <= arr.length-k; i++) {
				if (i > start && arr[i] == arr[i-1]) {
					continue;
				}
				quad.add(arr[i]);
				kSum(k-1, i+1, target - arr[i], arr, res, quad);
				quad.remove(quad.size()-1);
			}
			return;
		}
		int l = start, r = arr.length-1;
		while (l < r) {
			long sum = (long) arr[l] + arr[r];
			
			if (sum < target) {
				l++;
			} else if (sum > target) {
				r--;
			} else {
				List<Integer> temp = new ArrayList<>(quad);
				temp.add(arr[l]);
				temp.add(arr[r]);
				
				res.add(temp);
				
				l++;
				while (l < r && arr[l] == arr[l-1]) {
					l++;
				}
			}
		}
	}
	
	
	
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find(int[] arr, int n, int target) {
		long s = 0;
		Arrays.sort(arr);
		
		List<List<Integer>> res = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			if (i > 0 && arr[i] == arr[i-1]) {continue;}
			for(int j = i+1; j < n; j++) {
				if(j > i+1 && arr[j] == arr[j-1]) {continue;}
				int p = j+1, q = n-1;
				while (p < q) {
					s = (long) arr[i] + arr[j] + arr[p] + arr[q];

// In Java, int overflow does not throw an error — it silently wraps around.
// So by the time you check if (s > Integer.MAX_VALUE), 
// the overflow has already happened, meaning the check is useless.
//                    if (s > Integer.MAX_VALUE || s < Integer.MIN_VALUE){
//                        s = 0;
//                    }
// So instead, Use Long 😊
					
					if (s > target) {
						q--;
					} else if (s < target) {
						p++;
					} else {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[p] + " " + arr[q] + " | " + s);
						res.add(Arrays.asList(arr[i], arr[j], arr[p], arr[q]));
						p++;
						while (p < q && arr[p] == arr[p-1]) {
							p++;
						}
					}
				}
			}
		}
		System.out.println(res);
	}
}
