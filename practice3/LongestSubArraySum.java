package practice3;

import java.util.HashMap;
import java.util.Map;


// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

// https://leetcode.com/problems/range-sum-query-immutable/

public class LongestSubArraySum {
	public static void main(String[] args) {
		int[] arr = {10,5,2,7,1,9};
		int n = arr.length, target = 15;
		sum4(arr, n, target);
		
		
		
		
	}
	// -1 -1 1
	//  0  1 2
    //     i 
	//  j
	//  s = -2
	
	public static void sum4(int[] arr, int n, int t) {

		// Link: [https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1]
		// map = 0,1  10,0  15,1  17,2  24,3  25,4  26,5   35,6 
		// arr = 10, 5, 2, 7, 1, 9
		// pref= 10, 15, 17, 24, 25, 26, 35
		
		
		// IMPORTANT:
		// RangeSum(s,e) = pref[e] - pref[s-1] (if sum(0, e) = pref[e] )
		
		// sum(0,1) = pref[1] - pref[0-1] (We treat pref[-1] = 0✨)
		// 
		
		int s = 0, c = 0;
		// 10,5,2,7,1,9
		//  i
		// map = 0,1  10,0  15,1  17,2  24,3  25,4  26,5   35,6    
		// s = 35
		// r = 20
		// c = 2
		
		// At any given index, The number of possible sub-arrays can be determined by
		// the count of previous prefix-sums that, when subtracted, results in the
		// desired difference of K.
		
		
		// [1, 0, 1, 2, 1, 0], K=4
		//  0  1  2  3  4  5
		
		// MAP = 0,1  1,2  2,1  4,1  5,2
		// S   = 5
		// REM = 1
		// c   = 5
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < n; i++) {
			s += arr[i];
			
			int rem = s - t;
			if (map.containsKey(rem)) {
				c += map.get(rem);
			}
			
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		System.out.println(c);
	}
	
	
	public static void sum3(int[] arr, int n, int t) {
		int i = 0, j = 0, s = arr[i], l = 0;
		
		while (i < n && j < n) {

			while (j <= i && s > t) {
				s -= arr[j];
				j++;
			}
			
			if (s == t) {
//				l = Math.max(l, i-j+1);
				l++;s = 0;
			}
			
			i++;
			if (i < n) {
				s += arr[i];
			}
		}
		System.out.println(l);
	}
	
	public static void sum2(int[] arr, int n, int t) {
		Map<Integer, Integer> map = new HashMap<>();
		
		// 10, 5, 2, 7, 1, 9
		//  0  1  2  3  4  5
		//              i 
		// sum = 25, len = 4, t = 15
		// rem = 10
		// x = i-map.get(rem) -> 3 - 0
		// map = [(10,0), (15, 1), (17, 2), (24, 3), (25, 4), (34, 5)*]
		
		
		int sum = 0, len = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			
			if (sum == t) {
				//len = Math.max(len, i+1);
				len++;
			}
			int rem = sum - t;
			
			if (map.containsKey(rem)) {
				int x = i - map.get(rem); 
				// x: 💡 at i=4, curren sum = 25 & rem = 10, 
				// Since rem(10) exists in our map, It means
				// Sub-array between those indices has sum == target
				
				//len = Math.max(x, len);
				len += x;
			}
			
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		System.out.println(len);
	}
	
	public static void sum(int[] arr, int n, int t) {
		int sum = 0, len = -1;
		
		// [2,3,5,2,1,2]
		//  0 1 2 3 4 5
		//      i
		//      j
		//  sum = 5 == t -> len = 1-0+1 => 2, 
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if (sum == t) {
					len = Math.max(j-i+1, len);
				}
			}
			sum = 0;
		}
		System.out.println(len);
	}
}
