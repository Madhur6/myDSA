package practice2;

import java.util.Arrays;

//https://leetcode.com/problems/sort-an-array/description/

public class countingSort {
	public static void main(String[] args) {
		int[] arr = {7,8,5,6,4,3,1,2};
		
		sort(arr);
	}
	
	public static void sort(int[] arr) {
		int len = arr.length;
		int[] output = new int[len];
		
		int max = Arrays.stream(arr).max().orElse(-1);
		
		int[] count = new int[max+1];
		int cLen = count.length;
		
		for (int i = 0; i < len; i++) {
			count[arr[i]]+=1;
		}
		
		for (int i = 1; i < cLen; i++) {
			count[i] += count[i-1];
		}
		
		int i = len-1;
		while (i >= 0) {
			output[count[arr[i]-1]] = arr[i];
			count[arr[i]]-=1;
			i--;
		}
		
		for (int x = 0; x < len; x++) {
			arr[x] = output[x];
		}
}






