package practice5;


// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class buyOrSellStock2 {
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int profit = sol(arr);
		System.out.println("Profit: " + profit);
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static int sol(int[] arr) {
		int n = arr.length, profit = 0, j = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[j]) {
				profit += arr[i] - arr[j];
				j = i;
			} else {
				j = i;
			}
		}
		return profit;
	}
}
