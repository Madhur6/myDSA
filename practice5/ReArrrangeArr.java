package practice5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

public class ReArrrangeArr {
	public static void main(String[] args) {
		int[] arr = {1,2,-4,-5,3,4}; // 3,1,-2,-5,2,-4
		int n = arr.length;
		
		find3(arr, n);
	}
	
	// There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). 
	// Without altering the relative order of positive and negative elements, you must return an array of 
	// alternately positive and negative values. 
	// The leftover elements should be placed at the very end in the same order as in array A.
	
	//	Input:
	//		arr[] = {1,2,-4,-5,3,4}, N = 6
	//		Output:
	//		1 -4 2 -5 3 4
	public static void find3(int[] nums, int x) {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] < 0) {
				l2.add(nums[i]);
			} else {
				l1.add(nums[i]);
			}
		}
		
		int i = 0, j = 0, c = 0;
		int[] res = new int[n];
		while (i < l1.size() || j < l2.size()) {
			if (i < l1.size()) {
				res[c] = l1.get(i);i++;c++;
			}
			if (j < l2.size()) {
				res[c] = l2.get(j);j++;c++;
			}
		}
		while (i < l1.size()) {
			res[c] = l1.get(i);i++;c++;
		}
		while (j < l2.size()) {
			res[c] = l2.get(j);j++;c++;
		}
		System.out.println(Arrays.toString(res));
	}
	
	public static void find2(int[] nums, int x) {
		int n = nums.length, p = 0, q = 1;
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				res[p] = nums[i];p+=2;
			} else {
				res[q] = nums[i];q+=2;
			}
		}
		System.out.println(Arrays.toString(res));
	}
	
	public static void find(int[] nums, int x) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (nums[i] < 0){
                l1.add(nums[i]);
            } else {
                l2.add(nums[i]);
            }
        }
        int[] res = new int[n];
        // METHOD - I
//        int i = 0, j = 0, c = 0;
//        while (i < l1.size() || j < l2.size()){
//            if(j <l2.size()){
//                res[c] = l2.get(j);j++;c++;
//            }
//            if(i < l1.size()){
//                res[c] = l1.get(i);i++;c++;
//            }
//        }
        
        // METHOD - II
        // [3,1,2] [-2,-5,-4]
        //  i        i
        // i = 0 - 3
        // 0   1   2 
        // 
        // res = [3, -2, 1, -5, 2, -4]
        for (int i = 0; i < n/2; i++) {
        	res[2*i] = l2.get(i);
        	res[2*i+1] = l1.get(i);
        }
        System.out.println(Arrays.toString(res));
	}
}











