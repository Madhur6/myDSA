package practice5;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		List<Integer> res = traverse(arr);
		
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		System.out.println(res);
		
	}
	
	// time complexity : O(n*m)💖
	// space complexity: O(1)✨
	public static List<Integer> traverse(int[][] arr) {
		List<Integer> res = new ArrayList<>();
		
		int n = arr.length, m = arr[0].length;
		
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		// top = 1, bottom = 1
		// l   = 1, r      = 1
		// res = [1, 2, 3, 6, 9, 8, 7, 4]
		
		// while (0 <= 2 && 0 <= 2) -> for (int i = 0 | 1; i <= 2 | 1; i++) --> arr[1][i]
		//							-> for (int i = 1; i <= 2; i++) --> arr[i][2]
		//    if (top <= bottom)    -> for (int i = 1; i >= 0; i--) --> arr[2][i]
		
		//    if (l   <= r     )    -> for (int i = 1; i >= 1; i--) --> arr[i][0] 
		int top = 0, bottom = n-1, l = 0, r =  m-1;
		
		while (top <= bottom && l <= r) {
			for (int i = l; i <= r; i++) {
				res.add(arr[top][i]);
			}
			top+=1;
			
			for (int i = top; i <= bottom; i++) {
				res.add(arr[i][r]);
			}
			r-=1;
			
			if (top <= bottom) {for (int i = r; i >= l; i--) {
				res.add(arr[bottom][i]);
			}bottom-=1;}
			
			if (l <= r) {
				for (int i = bottom; i>=top; i--) {
					res.add(arr[i][l]);
				}
				l+=1;
			}
		}
		return res;
	}
}
