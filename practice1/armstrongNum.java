package practice;


// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

public class armstrongNum {
	public static void main(String[] args) {
		int x = 153;
		boolean res = find(x);
		System.out.println("The result is: " + res);
	}
	
	public static boolean find(int x) {
		int s = 0, o = x;
		while (x > 0) {
			int n = x % 10;
			s += Math.pow(n, 3);
			x = x/10;
		}
		return s == o;
	}
}
