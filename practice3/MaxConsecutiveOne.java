package practice3;



public class MaxConsecutiveOne {
	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 1, 1, 1};
		int n = arr.length;
		
		find(arr, n);
		
		
		
	}
	
	public static int find(int[] arr, int n) {
		int c = 0, max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				c++;
				max = Math.max(c, max);
			} else {
				c = 0;
			}
		}
		System.out.println(c + " " + max);
		return max;
	}
}
