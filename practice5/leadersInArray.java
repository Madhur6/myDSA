package practice5;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/dsa/leaders-in-an-array/

public class leadersInArray {
	public static void main(String[] args) {
		int[] arr = {7,5,4,2,1,9};
		ArrayList<Integer> list = find(arr);
		System.out.println(list);
	}
	
	public static ArrayList<Integer> find(int[] arr) {
		int n = arr.length, max = Integer.MIN_VALUE;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = n-1; i >= 0; i--) {
			if (arr[i] >= max) {
				max = arr[i];
				list.addFirst(arr[i]);
			}
		}
		return list;
	}
}
