package practice5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/next-permutation/description/

public class nextPermutation {
	public static void main(String[] args) {
		int[] nums = {1,1,5};
		
		
		// SOLUTION I ✨ [DOESN'T WORKS😅]
//		int x = nums.length;
//		List<List<Integer>> res = new ArrayList<>();
//		findPermute(nums, x, res, 0);
//		System.out.println(res);
//		
//        res.sort((a,b) -> {
//            for (int i = 0; i < a.size(); i++){
//                int cmp = Integer.compare(a.get(i), b.get(i));
//                if (cmp != 0) return cmp;
//            }
//            return 0;
//        });
//
//        List<Integer> temp = Arrays.stream(nums).boxed().toList();
//
//        for (int i = 0; i < x; i++){
//        	if (i < x-1 && res.get(i).equals(temp)){
//        		// System.out.println(res.get(i+1));
//        		// nums = res.get(i+1).stream().mapToInt(Integer::intValue).toArray(); // re-assigning doesn't works
//        		List<Integer> k = res.get(i+1);
//        		for (int j = 0; j < k.size(); j++){
//        			nums[j] = k.get(j);
//        		}
//        		break;
//        	} else {
//        		// System.out.println(res.get(0));
//        		// nums = res.get(0).stream().mapToInt(Integer::intValue).toArray(); // // re-assigning doesn't works
//        		List<Integer> k = res.get(0);
//        		for (int j = 0; j < k.size(); j++){
//        			nums[j] = k.get(j);
//        		}
//        		break;
//        	}
//        }
//        System.out.println(Arrays.toString(nums) + res);
//        
        
        
        
        //SOLUTION II ✨
		findPermute2(nums);
		System.out.println(Arrays.toString(nums));
        
        
        
	}


	
	public static void findPermute(int[] arr, int n, List<List<Integer>> myList, int start) {
		if (start == n) {
			List<Integer> res = new ArrayList<>();
			for (int x: arr) {
				res.add(x);
			}
			myList.add(res);
			return;
		}
		
		for (int i = start; i < n; i++) { 
			swap(arr, i, start); 
			findPermute(arr, n, myList, start+1);
			swap(arr, i, start); // BACKTRACKING
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	// fn(arr, n, list, c)
	// c = 0; 	// if (c == n) 
	// for (int i = 0; i < 3; i++) -> swap (arr, 0, 0) // no swap
	// fn(arr, n, list, 0+1)
	// swap(arr, i, start)
	// list []
	
	// fn(arr, n, list, 1)
	// c = 1; 	// if (c == n) 
	// for (int i = 1; i < 3; i++) -> swap (arr, 1, 1) // no swap
	// fn(arr, n, list, 1+1)
	// swap(arr, i, start)
	// list []
	
	// fn(arr, n, list, 2)
	// c = 2; 	// if (c == n) 
	// for (int i = 2; i < 3; i++) -> swap (arr, 2, 2) // no swap
	// fn(arr, n, list, 2+1)
	// swap(arr, i, start)
	// list []
	
	// fn(arr, n, list, 3)
	// c = 3; 	// if (c == n) ✔ -> myList -> for (x: nums) -> myList[1,2,3] -> list[[1,2,3]] -> return;
	
	// back-track
	// fn(arr, n, list, 2)
	// c = 2; 	// if (c == n) 
	// for (int i = 2; i < 3; i++) -> swap (arr, 2, 2) // no swap
	// fn(arr, n, list, 2+1) -> returned
	// swap(arr, 2, 2) // no swap -> loop ends i = 3 -> return;
	// list[[1,2,3], ]
	
	// back-track
	// fn(arr, n, list, 1)
	// c = 1; 	// if (c == n) 
	// for (int i = 1; i < 3; i++) -> swap (arr, 1, 1) // no swap
	// fn(arr, n, list, 1+1) -> returned
	// swap(arr, 1, 1) // no swap -> loop continues (i = 2)
	// list[[1,2,3], ]
	
	// for (int i = 2; i < 3; i++) -> swap (arr, 2, 1) // swapped [1,3,2]
	// fn(arr, n, list, 1+1) -> new call
	// swap(arr, i, start)
	
	// new call
	// fn(arr, n, list, 2)
	// c = 2; 	// if (c == n) 
	// for (int i = 2; i < 3; i++) -> swap (arr, 2, 2) // no swap
	// fn(arr, n, list, 2+1) -> new call
	// swap(arr, i, start)
	
	// new call
	// fn(arr, n, list, 3)
	// c = 3; 	// if (c == n) ✔ -> myList -> for (x: nums) -> myList[1,3,2] -> list[[1,2,3], [1,3,2], ] -> return;
	
	// fn(arr, n, list, 3) -> returned
	// swap(arr, 2, 2)
	
	
	
	
	
	
	
	
	
	
	//SOLUTION II ✨
	
	public static void findPermute2(int[] arr) {
		int n = arr.length, leftSmallIdx = -1;
		
		for (int i = n-2; i >= 0; i--) {
			if (arr[i] < arr[i+1]) {
				leftSmallIdx = i;
				break;
			}
		}
		
		if (leftSmallIdx == -1) {
			reverse(arr, 0, n-1);
			return;
		}
		
		for (int i = n-1; i > leftSmallIdx; i--) {
			if (arr[i] > arr[leftSmallIdx]) {
				int temp = arr[i];
				arr[i] = arr[leftSmallIdx];
				arr[leftSmallIdx] = temp;
				break;
			}
		}
		
		reverse(arr, leftSmallIdx+1, n-1);
		
	}
	
	public static void reverse(int[] arr, int l, int r) {
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

}





