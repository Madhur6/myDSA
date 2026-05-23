package practice1;

import java.util.Arrays;

//Q1: (nCrr) https://www.geeksforgeeks.org/problems/ncr1019/1
//
//Q2: (nPr) https://www.geeksforgeeks.org/problems/npr4253/1

public class nprNcr {
	
	private static int[][] dp;
	
	public static void main(String[] args) {
		int n = 5, r = 2;
		dp = new int[n+1][r+1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		int res = ncr(n,r); // nCr = n!/(n-r)!*(r!)
		
		System.out.println("nCr of given nums is: " + res);
		
		
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		int res2 = npr(n,r); // nPr = n!/(n-r)!
		
		System.out.println("nPr of given nums is: " + res2);
	}
	
	public static int ncr(int x, int y) {
		if (y == 0 || x == y) {
			return 1;
		} 
		
		else if (y > x) {
			return 0;
		} 
		
		if (dp[x][y] != -1) {
			return dp[x][y];
		}
		
		dp[x][y] = ncr(x-1, y-1) + ncr(x-1, y);
		return dp[x][y];
	}
	
	public static int npr(int x, int y) {
		if (y == 0) {
			return 1;
		} else if (y > x) {
			return 0;
		}
		
		if (dp[x][y] != -1) {
			return dp[x][y];
		}
		
		dp[x][y] = npr(x-1, y-1)*x;
		return dp[x][y];
	}
}
