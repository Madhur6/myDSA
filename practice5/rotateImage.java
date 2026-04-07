package practice5;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-image/submissions/1783023735/


// Try: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]], To find out why (r-l)?

// 5  1  9  11
// 2  4  8  10
//13  3  6  7
//15 14 12  16

// l = 1, r = 2
// t = 1, b = 2 

// while (1 < 2) -> for (i = 0; i < (2-1); i++) --> i = 1;
// --> topLeft    = arr[1][1+] -> 4
// --> topRight   = arr[1+0][2] -> 8
// --> bottomLeft = arr[2-0][1] -> 3
// --> bottomRight= arr[2][2-0] -> 6

public class rotateImage {
	public static void main(String[] args) {
		int[][] mtx = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(mtx);
		for(int[] a: mtx) {
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void rotate(int[][] arr) {
		int l = 0, r = arr.length-1;
		int top = 0, bottom = 0, topLeft = 0;
		while (l < r) {
			// Square Mtx, So works
			top = l;
			bottom = r;
			for (int i = 0; i < (r-l); i++) {
				
				// save topLeft
				topLeft = arr[top][l+i];
				
				// move bottomLeft to topLeft
				arr[top][l+i] = arr[bottom-i][l];
				
				// move bottomRight to bottomLeft
				arr[bottom-i][l] = arr[bottom][r-i];
				
				// move topRight into bottomRight
				arr[bottom][r-i] = arr[top+i][r];
				
				// move topLeft into topRight
				arr[top+i][r] = topLeft;
			}
			l+=1;
			r-=1;
		}
	}
}
