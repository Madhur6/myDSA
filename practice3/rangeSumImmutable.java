package practice3;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/range-sum-query-immutable/description/

public class rangeSumImmutable {
	public static void main(String[] args) {
		String[] operations = {"NumArray", "sumRange", "update", "sumRange"};
		
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
			} else {
				int index = values[i][0];
				int val = values[i][1];
				op.add(obj.update(index, val));
			}
		}
		
		System.out.println(op);
	}
}


// METHOD - II: Segment Tree

// arr: [1, 2, 5, 6, 7, 9]
//       0  1  2  3  4  5   | Finally you will have '30'
//           /            \

//  ^ (8 will be returned)  ^ (22 will be returned)
//  |                       |
//  [1, 2, 5]               [6,7,9]

//(13 will be returned) ^       ^ (9 will be returned)
//                      |       |

// [1,2]   [5]         [6,7]   [9]

//(6 will be returned) ^    ^ (7 will be returned)
//                     |    |
// [1] [2]            [6]   [7]


// ✨ Segment Tree
//               30
// 				 /\
//              8  22
//             /\    /\
//            3  5  13 9
//           /\     /\
//          1  2   6  7


class NumArray {
    int[] arr;
    int[] nums;
    // time complexity : O(n)💖
    // space complexity: O(1)✨
    public NumArray(int[] nums) {
        int n = nums.length;
        arr = new int[n];
        
        this.nums = nums;

        arr[0] = nums[0];
        for (int i = 1; i < n; i++){
            arr[i] += arr[i-1] + nums[i];
        }
    }
    
    // time complexity : O(1)💖
    // space complexity: O(1)✨
    public void update(int index, int val) {
    	int diff = val - nums[index];
    	
    	for (int i = index; i < arr.length; i++) {
    		arr[i] += diff;
    	}
    }
    
    // time complexity : O(1)💖
    // space complexity: O(1)✨
    public int sumRange(int left, int right) {
        if (left == 0){
            return arr[right];
        }
        else {
            return arr[right] - arr[left-1];
        }
    }

}



// METHOD - I: Basic Approach😌
//class NumArray {
//    int[] arr;
//    int[] nums;
//    public NumArray(int[] nums) {
//        int n = nums.length;
//        arr = new int[n];
//        
//        this.nums = nums;
//
//        arr[0] = nums[0];
//        for (int i = 1; i < n; i++){
//            arr[i] += arr[i-1] + nums[i];
//        }
//    }
//    
//    public void update(int index, int val) {
//    	int diff = val - nums[index];
//    	
//    	for (int i = index; i < arr.length; i++) {
//    		arr[i] += diff;
//    	}
//    }
//    
//    public int sumRange(int left, int right) {
//        if (left == 0){
//            return arr[right];
//        }
//        else {
//            return arr[right] - arr[left-1];
//        }
//    }
//    // 2 5 4  6  1
//    // 0 1 2  3  4
//
//    // 2 7 11 17 18 
//}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
