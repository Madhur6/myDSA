package practice;

import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/prime-number2314/1

public class primeNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		boolean res = checkPrime(x);
		System.out.println("The " + x + " is prime: " + res);
	}
	
	public static boolean checkPrime(int x) {
		if (x < 2) return false;
		
		int i = 2;
		while (i <= Math.sqrt(x)) {
			if (x % i == 0) return false;
			i+=1;
		}
		return true;
	}
}
