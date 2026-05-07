package practice3;

import java.util.Arrays;


// https://leetcode.com/problems/move-zeroes/description/

public class moveZeroesToEnd {
	public static void main(String[] args) {
		int[] arr = {10,0,3,4,0,1,0,2,0};
		int len = arr.length;
		move2(arr, len);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void move2(int[] arr, int n) {
		int x = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				x = i;break;
			}
		}
		if (x == -1) {
			return;
		}
		// [10,3,4,1,2,0,0,0,0]
		//             x 
		//                 i
		for (int i = x+1; i < n; i++) {
			if (arr[i] != 0) {
//				int temp = arr[i];
//				arr[i] = arr[x];
//				arr[x] = temp;x++;	
//				System.out.println(Arrays.toString(arr));
				
				// using XOR
				arr[i] = arr[i] ^ arr[x];
				arr[x] = arr[i] ^ arr[x];
				arr[i] = arr[i] ^ arr[x]; x++;
			}
		}
	}
	
	public static void move(int[] arr, int n) {
		int x = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[x] = arr[i];x++;
			}
		}
		
		for (int i = x; i < n; i++) {
			arr[i] = 0;
		}
	}
	
}
