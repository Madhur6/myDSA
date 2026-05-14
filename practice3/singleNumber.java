package practice3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/single-number/description/

public class singleNumber {
	public static void main(String[] args) {
		int[] arr = {2,3,2,3,10,1,1,7,10,4,0,4,0};
		
		find4(arr);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find4(int[] arr) {
		// XOR
		// a ^ b = a'b + b'a
		// 1 ^ 0 = 0 0 + 1 1 => 1 (for different numbers, It will return 1)
		
		// 1 ^ 1 = 0 1 + 0 1 => 0 (for same numbers, It will return 0)
		
		int n = arr.length;
		int xor = 0;
		for (int i = 0; i < n; i++) {
			xor = xor ^ arr[i];
		}
		System.out.println(xor);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find3(int[] arr) {
		int n = arr.length;
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		int[] nums = new int[max+1];
		for (int i = 0; i < n; i++) {
			nums[arr[i]]+=1;
		}
		
		System.out.println(Arrays.toString(nums));
		
		int res = -1;
		for (int i = 0; i < n; i++) {
			if (nums[arr[i]] == 1) {
				res = arr[i];
			}
		}
		System.out.println(res);
		
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find2(int[] arr) {
		int n = arr.length;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 0);
			}
			map.put(arr[i], map.get(arr[i])+1);
		}
		
		int c = -1;
		
		for (HashMap.Entry<Integer, Integer> e:map.entrySet()) {
			if (e.getValue() == 1) {
				c = e.getKey();
			}
		}
		
		System.out.println(c);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int find(int[] arr) {
		int n = arr.length;
		int res = -1;
		for (int i = 0; i < n; i++) {
			int c = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					c++;
				}
			}
			if (c == 1) {
				res = arr[i];
				break;
			}
		}
		System.out.println(res);
		return res;
	}
}
