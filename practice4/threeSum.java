package practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
		int n = arr.length;
		List<List<Integer>> res = find(arr, n);
		System.out.println(res);
	}
	
	public static List<List<Integer>> find(int[] nums, int n){
		// -1, 0, 1, 2, -1, -4
		//  
		// sorted: -4, -1, -1, 0, 1, 2
		//                  i
		//                     j     k
		// 
		// s = -1 + 0 + 1 -> 0 > 0
		// if i > 0 && nums[i] == nums[i-1] -> continue
		// res = [-1,-1,2], [-1, 0, 1]
		
		// 0, 0, 0, 0
		// i
		//          j  k
		// s = 0 + 0 + 0 -> 0 > 0
		// if i > 0 && nums[i] == nums[i-1] -> continue
		// res = [0,0,0], 
		
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		int s = 0;
		for (int i = 0; i < n; i++) {
			if (i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			int j = i+1, k = n-1;
			while (j < k) {
				s = nums[i] + nums[j] + nums[k];
				
				if (s > 0) {
					k-=1;
				} else if (s < 0) {
					j+=1;
				} else {
					res.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j+=1;
					while (j < k && nums[j] == nums[j-1]) {
						j+=1;
					}
				}
			}
		}
		return res;
	}

}
