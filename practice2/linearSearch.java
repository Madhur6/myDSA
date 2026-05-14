package practice2;

import java.util.Arrays;
import java.util.Scanner;

//https://www.codechef.com/learn/course/searching-sorting/SORTSEARCH1/problems/SESO03

public class linearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter target to search for: ");
		String line = sc.nextLine();
		
		String[] arr1 = line.trim().split("\\s+");
		int x = arr1.length;
		int[] newArr = new int[x];
		for (int i = 0; i < x; i++) {
			newArr[i] = Integer.parseInt(arr1[i]);
		}

		System.out.println(Arrays.toString(newArr) + " >>> "
				+ "" + newArr[1684]);

		
		int[] arr = {1,2,3,44,10,2,-1};
		
		search(newArr, 8200);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void search(int[] arr, int target) {
		int len = arr.length;
		int idx = -1;
		boolean found = false;
		
		for (int i = 0; i <= len/2; i++) {
			if (arr[i] == target) {
				idx = i;
				found = true;break;
			}
			else if (arr[len-1-i] == target) {
				idx = len-1-i;
				found = true;break;
			}
		}
		if (found) {
			System.out.println("Found target " + target + " at index " + idx);	
		} else {
			System.out.println(target + " not found!");
		}
	}
}
