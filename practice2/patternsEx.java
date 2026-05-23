package practice2;

import java.util.Scanner;

public class patternsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int n = sc.nextInt();
		
		marioBox(n); // BOX 📦
		
		System.out.println("         ");
		
		marioTriangle(n); // TRIANGLE 📐
		
		System.out.println("         ");
		
		marioTriangle2(n); // TRIANGLE 2 📐
		
		System.out.println("         ");
		
		marioTriangle3(n); // TRIANGLE 3 📐
		
		System.out.println("         ");
		
		marioTriangle4(n); // TRIANGLE 4 📐
		
		System.out.println("         ");
		
		marioTriangle5(n); // TRIANGLE 5 📐
		
		System.out.println("         ");
		
		marioTriangle6(n); // TRIANGLE 6 📐
		
		System.out.println("         ");
		
		numberTriangle(n); // TRIANGLE 7 📐
		
		System.out.println("         ");
		
		numberTriangle2(n); // TRIANGLE 8 📐
		
		System.out.println("         ");
		
		pascalTriangle(n); // TRIANGLE 9 📐 |	LeetCode: [https://leetcode.com/problems/pascals-triangle/description/]
		
		System.out.println("         ");
		
		diamond(n); // DIAMOND 1 🔶
		
		System.out.println("         ");
		
		plus(n); // plus ➕
		
		System.out.println("         ");
		
		star(n); // star 🌟
		
		System.out.println("         ");
		
		diamond2(n); // DIAMOND 2 🔶 
	}

	
	
	// BOX
	public static void marioBox(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 📐
	public static void marioTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 2 📐
	public static void marioTriangle2(int n) {
		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 3 📐
	public static void marioTriangle3(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 4 📐
	public static void marioTriangle4(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.print(" ");
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 5 📐
	public static void marioTriangle5(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 6 📐
	public static void marioTriangle6(int n) {
		for (int i = n-1; i >= 0; i--) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 7 📐
	public static void numberTriangle(int n){
		for (int i = 0; i < n; i++) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 8 📐
	public static void numberTriangle2(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			int c = 0; // Declare it outside the first-for-loop to print incrementing numbers...
			for (int j = 0; j < i; j++) {
				System.out.print(++c + " ");
			}System.out.println();
		}
	}
	
	
	
	// TRIANGLE 9 📐
	
//	LeetCode: [https://leetcode.com/problems/pascals-triangle/description/]
	
//	PASCAL'S TRIANGLE : Gives us the coefficient of the bionomial-expressions
//
//	# (a+b)^0 = 1
//	# (a+b)^1 = a(1) + b(1)
//	# (a+b)^2 = a^2(1) + 2ab + b^2(1)
//	# (a+b)^3 = a^3 + 3a^2b + 3ab^2 + b^3
//	# (a+b)^4 = a^4 + 4a^3b + 4ab^3 + 6a^2b^2 + b^4
//
//	#      1
//	#     1 1
//	#    1 2 1
//	#  1  3  3 1
//	#1  4  6  4  1 
	public static void pascalTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			int coef = 1;
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(coef + " ");
				coef = coef * (i-j)/j;
			}System.out.println();
			
		}
	}

	
	
	// DIAMOND 1 🔶 
	public static void diamond(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
		for (int i = n-2; i >= 0; i--) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	// plus ➕
	public static void plus(int n){
		for (int i = 1; i <= n; i++) {
			int m = n/2+1;
			for (int j = 1; j <= n; j++) {
				if (i == m || j == m) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	
	
	// star 🌟
	public static void star(int n) {
		for (int i = 0; i < n; i++) {
			int m = n/2;
			for (int j = 0; j < n; j++) {
				if (i == j || i+j == n-1 || j == m || i == m) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	
	
	// DIAMOND 2 🔶 
	public static void diamond2(int n) {
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n; j++) {
//				System.out.print("*");
				if (i+j <= n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
				if (i+n <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
				if (i+j >= 2*(n-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}System.out.println();
		}
	}

}









