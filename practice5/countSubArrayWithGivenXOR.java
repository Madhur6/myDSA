package practice5;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1

public class countSubArrayWithGivenXOR {
	public static void main(String[] args) {
		int[] arr = {4, 2, 2, 6, 4};
		int k = 6;
		
		int res = solution(arr, k);
		System.out.println("Count: " + res);
	}
	

	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int solution(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		// {
		// 	4:2, 6: 2, 2:1  
		// }
		
//		100 | 4
//	    000 | 0 ⊕ 
//	   ----- 
//		100 | 4
//		
//		
//		
//		IMPORTANT:
//		
//		prefixXor[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]
//		
//		prefixXor[j] ^ prefixXor[i-1] = XOR of subarray(i...j)
//		
//		sum(0,1) = pref[1] - pref[0-1] (We treat pref[-1] = 0✨)
		
		int n = arr.length, c = 0, xor = 0;
		
//		map.put(0,1); 🌟
		for (int i = 0; i < n; i++) {
			xor ^= arr[i];
			
//			100 | 4
//		    110 | 6 ⊕ 
//	       ----- 
//		    010 | 2 (XOR(4,6) == Difference of 4 & 2)
			
			c += map.getOrDefault(xor^k, 0);
			
			// We can eliminate the below special case, 🌟
			// By initializing: map.put(0,1); 🌟
			if (xor == k) {
				c++;
			}
			
			map.put(xor, map.getOrDefault(xor, 0)+1);
		}
		return c;
	}
}
