package practice3;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/range-sum-query-immutable/description/

public class rangeSumImmutable {
	public static void main(String[] args) {
		String[] operations = {"NumArray", "sumRange", "sumRange", "sumRange"};
		
		int[][] values = {{-2,0,3,-5,2,-1}, {0,2}, {2,5}, {0,5}};
		
		NumArray obj = null;
		
		List<Object> op = new ArrayList<>();
		
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].equals("NumArray")) {
				obj = new NumArray(values[i]);
				op.add(null);
			} else if (operations[i].equals("sumRange")) {
				int left = values[i][0];
				int right = values[i][1];
				op.add(obj.sumRange(left, right));
			}
		}
		
		System.out.println(op);
	}
}

class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        int n = nums.length;
        arr = new int[n];

        arr[0] = nums[0];
        for (int i = 1; i < n; i++){
            arr[i] += arr[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0){
            return arr[right];
        }
        else {
            return arr[right] - arr[left-1];
        }
    }
    // 2 5 4  6  1
    // 0 1 2  3  4

    // 2 7 11 17 18 
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */