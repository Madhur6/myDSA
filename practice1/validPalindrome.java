package practice1;

import java.util.Scanner;

// https://leetcode.com/problems/valid-palindrome/description/

public class validPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		
		boolean res = check(s);
		System.out.println("It is a palindrome: " + res);
		
		boolean res2 = check2(s);
		System.out.println("It is a palindrome(2): " + res2);
		
		
		boolean res3 = check3(s);
		System.out.println("It is a palindrome(3): " + res3);
		
	}
	
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static boolean check3(String str) {
		int l = 0, r = str.length()-1;

		while (l < r) {
			while (l < r && !Character.isLetterOrDigit(str.charAt(l))) {
				l++;
			}
			
			while (r > 0 && !Character.isLetterOrDigit(str.charAt(r))) {
				r--;
			}
			
			Character c1 = Character.toLowerCase(str.charAt(l));
			Character c2 = Character.toLowerCase(str.charAt(r));
			
			if (l < r && c1 != c2) {
				return false;
			}
			l+=1;
			r-=1;
		}
		return true;
	}
	
	
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static boolean check2(String str) {
		String s = trimm(str);
		
		int len = s.length();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			Character c = Character.toLowerCase(s.charAt(i));
			if ('a' <= c && c <= 'z') {
				sb.append(c);
			} else if ('0' <= c && c <= '9') {
				sb.append(c);
			}
		}
	
		System.out.println("s:" + sb.toString());
		
		return sb.toString().equals(sb.reverse().toString());	
	}

	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static boolean check(String s) {
		StringBuilder sb = new StringBuilder(s).reverse();
		
		if (s.equals(sb.toString())) {
			return true;
		}
		return false;
	}
	
	
	// Miscellaneous
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static String trimm(String s) {
		StringBuilder sb = new StringBuilder();
		
		int start = 0, end = s.length()-1;
		
		while (start <= end && s.charAt(start) == ' ') {
			start++;
		}
		
		while (end >= 0 && s.charAt(end) == ' ') {
			end--;
		}
		
		for (int i = start; i <= end; i++) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
}








