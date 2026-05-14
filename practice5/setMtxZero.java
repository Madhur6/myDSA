package practice5;

import java.util.Arrays;


// https://leetcode.com/problems/set-matrix-zeroes/submissions/1778813989/

public class setMtxZero {
	public static void main(String[] args) {
		int[][] arr = {{1,1,1,1}, {1,0,1,1}, {1,1,0,1}, {0,1,1,1}};
		find3(arr);
	}
	
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find3(int[][] arr) {
		// better space complexity
		// [😁|              ] col
		// [  ]
		// [  ]
		// [  ]
		// [  ]
		// row
		// 😁: this one is culprit, What should i do for this (Common in row & col)?

		// [__col0_
		// [  ]    |_________________] col
		// [  ]
		// [  ]
		// [  ]
		// [  ]
		// row 
		
		// ✔: This works now...
		
		int n = arr.length, m = arr[0].length, col0 = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					// mark the ith row
					arr[i][0] = 0;
					
					// mark the jth col
					if (j != 0) {
						arr[0][j] = 0;
					} else {
						col0 = 0;
					}
				}
			}
		}
		
		for (int i = 1; i <n; i++) {
			for (int j = 1; j < m; j++) {
				if (arr[i][j] != 0) {
					// check for col & row
					if (arr[0][j] == 0 || arr[i][0] == 0) {
						arr[i][j] = 0;
					}
				}
			}
		}
		
		// solve col first 💡
		if (arr[0][0] == 0) {
			// every one in the 1st row will be 0
			for (int j = 0; j < m; j++) {
				arr[0][j] = 0;
			}
		}
		
		if (col0 == 0) {
			for (int i = 0; i < n; i++) {
				arr[i][0] = 0;
			}
		}
		
		for (int[] x: arr) {
		System.out.println(Arrays.toString(x));}
		
	}
	
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find2(int[][] arr) {
		int n = arr.length, m = arr[0].length;
		int[] row = new int[n];
		int[] col = new int[m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		// [1,1,1] [1,0,1] [1,1,1]
		// [0,1,0] [0,1,0]
//		System.out.println(Arrays.toString(row) + Arrays.toString(col));
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (row[i] == 1 || col[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}
		
		for (int[] x: arr) {
		System.out.println(Arrays.toString(x));}
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void find(int[][] arr) {
		int n = arr.length; // no of rows
		
		for (int i = 0; i < n; i++) {
			int m = arr[i].length;
			for (int j = 0; j < m; j++) {
				
				if (arr[i][j] == 0) {
					makeRowZero(arr, n, m, i);
					makeColZero(arr, n, m, j);
				}
			}
		}
		
//		System.out.println(Arrays.toString(arr));
//		for (int[] row: arr) {
//			for (int val: row) {
//				System.out.println(val);
//			}
//			System.out.println();
//			
//		}
		
		for (int i = 0; i < n; i++) {
			int m = arr[i].length;
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == -1) {
					arr[i][j] = 0;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		for (int[] row: arr) {
			for (int val: row) {
				System.out.println(val);
			}
			System.out.println();
			
		}
	}
	
	// time complexity : O(m)💖
	// space complexity: O(1)✨
	public static void makeRowZero(int[][] arr, int n, int m, int x) {
		for (int i = 0; i < m; i++) {
			if (arr[x][i] != 0) {
				arr[x][i] = -1;
			}
		}
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void makeColZero(int[][] arr, int n, int m, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i][x] != 0) {
				arr[i][x] = -1;
			}
		}
	}
}
