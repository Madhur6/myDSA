package practice5;


// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class buyOrSellStock {
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int n = arr.length;
		
		find(arr, n);
	}
	public static void find(int[] arr, int n) {
		int profit = 0, maxProfit = -1, l = 0, r = 1;
		while (r < n) {
			if (arr[l] < arr[r]) {
				profit = arr[r] - arr[l];
				maxProfit = Math.max(maxProfit, profit);
			}
			else {
				l = r;
			}
			r++;
		}
		System.out.println("Max profit: " + maxProfit);
	}
}
