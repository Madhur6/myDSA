package practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

public class unionOfArrays {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {5,6,7};
		
		// arr = [1, 2, 3, 4, 3, 5, ]
		union2(a,b);
	}
	
	// array must be sorted
    // time complexity : O(n + m)💖
    // space complexity: O(n + m)✨
    public static ArrayList<Integer> union2(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();

        int m = a.length, n = b.length;
        
        int i = 0, j = 0;
        while (i < m && j < n) {
        	if (a[i] <= b[j]) {
        		if (arr.size() == 0 || (arr.get(arr.size()-1) != a[i])) {
        			arr.add(a[i]);
        		}
        		i++;
        	} else {
        		if (arr.size() == 0 || (arr.get(arr.size()-1) != b[j])) {
        			arr.add(b[j]);
        		}
        		j++;
        	}
        }
        
        while (i < m) {
        	if (arr.size() == 0 || arr.get(arr.size()-1) != a[i]) {
        		arr.add(a[i]);
        	}
        	i++;
        }
        
        while (j < n) {
    		if (arr.size() == 0 || arr.get(arr.size()-1) != b[j]) {
    			arr.add(b[j]);
    		}
    		j++;
        }
        
        System.out.println(arr);    
        return arr;
    }
	
    // time complexity : O(n + m)💖
    // space complexity: O(1)✨
    public static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        Set<Integer> mySet = new HashSet<>();
        
        int m = a.length, n = b.length;
        
        for (int i = 0; i < m; i++) {
        	if (!mySet.contains(a[i])) {
        		mySet.add(a[i]);
        	}
        }
        for (int i = 0; i < n; i++) {
        	if (!mySet.contains(b[i])) {
        		mySet.add(b[i]);
        	}
        }
        for (int x: mySet) {
        	arr.add(x);
        }
        System.out.println(arr);
        return arr;
        
    }
}













