package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1

public class printAllDivisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		List<Integer> res = printAllDivs(n);
		Collections.sort(res);
		
		for (int x: res) {System.out.print(x + " ");}
	}
	
	public static List<Integer> printAllDivs(int n) {
		
		// SortedSet<Integer> mySet = new TreeSet<>();
		// String res = mySet.stream().map(String::valueOf).collect(Collectors.joining(" ");
		
		List<Integer> res = new ArrayList<>();
//		for (int i = 1; i <= Math.sqrt(n); i++) {
//			if (n % i == 0) {
//				res.add(i);
//				if (n / i != i) {
//					res.add(n/i);
//				}
//			}
//		}
		
		int i = 1;
		while (i * i <= n) {
			if (n % i == 0) {
				res.add(i);
				if (n/i != i) {
					res.add(n/i);
				}
			}
			i++;
		}
		
		return res;
	}
}
