package practice2;

import java.util.Scanner;

public class patternsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int n = sc.nextInt();
		
//		marioBox(n); // BOX 📦
//		
//		System.out.println("         ");
//		
//		marioTriangle(n); // TRIANGLE 📐
//		
//		System.out.println("         ");
//		
//		marioTriangle2(n); // TRIANGLE 2 📐
//		
//		System.out.println("         ");
//		
//		marioTriangle3(n); // TRIANGLE 3 📐
//		
//		System.out.println("         ");
//		
//		marioTriangle4(n); // TRIANGLE 4 📐
//		
//		System.out.println("         ");
//		
//		marioTriangle5(n); // TRIANGLE 5 📐
//		
//		System.out.println("         ");
//		
//		marioTriangle6(n); // TRIANGLE 6 📐
//		
//		System.out.println("         ");
//		
//		numberTriangle(n); // TRIANGLE 7 📐
//		
//		System.out.println("         ");
//		
//		numberTriangle2(n); // TRIANGLE 8 📐
//		
//		System.out.println("         ");
//		
//		pascalTriangle(n); // TRIANGLE 9 📐 |	LeetCode: [https://leetcode.com/problems/pascals-triangle/description/]
//		
//		System.out.println("         ");
//		
//		diamond(n); // DIAMOND 1 🔶
//		
//		System.out.println("         ");
//		
//		plus(n); // plus ➕
//		
//		System.out.println("         ");
//		
//		star(n); // star 🌟
//		
//		System.out.println("         ");
//		
//		diamond2(n); // DIAMOND 2 🔶
//		
//		System.out.println("         ");
//
//		hollowRectangle(n); // Rectangle 🔼
//		
//		System.out.println("         ");
//		
//		circle(n); // circle 🔵
//		
//		System.out.println("         ");
//		
//		diamond3(n); // Diamond 3 🔶
//
//		System.out.println("         ");
//		
//		marioTriangle7(n); // TRIANGLE 10 📐
//		
//		System.out.println("         ");
//		
//		numberTriangle3(n); // TRIANGLE 11 📐
//		
//		System.out.println("         ");
//		
//		numberTriangle4(n); // TRIANGLE 12
//		
//		System.out.println("         ");
//		
//		marioTriangle8(n); // TRIANGLE 13 📐	
//
//		System.out.println("         ");
//		
//		marioTriangle9(n); // TRIANGLE 14 📐		
//		
//		System.out.println("         ");
//		
//		marioTriangle10(n); // TRIANGLE 15 📐			
//		
//		System.out.println("         ");
//		
//		marioTriangle11(n); // TRIANGLE 16 📐	
//		
//		System.out.println("         ");
//		
		marioTriangle12(n); // TRIANGLE 17 📐	
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
	
	
	
	// Rectangle 🔼
	public static void hollowRectangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				if (i == n-1 || j == n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	
	
	
	// circle 🔵
	
    // (x-h)**2 + (y-k)**2 == r**2
	public static void circle(int n) {
	     int h = n/2;
	     int k = n/2;
	     int r = n/2-1;
         for (int i = 0; i < n; i++){
             for (int j = 0; j < n; j++){
                 double distance = (i - h)*(i - h) + (j - k)*(j - k);
                 if (distance >= r*r){
                    System.out.print(" ");
                 } else {
                    System.out.print("*");
                 }
             }
             System.out.println();
         }
	}
	
	
	
	// Diamond 3 🔶
	public static void diamond3(int n) {
         for (int i = 0; i < n; i++){
             for (int j = 0; j < 2*n; j++){
                 if (i+j == n-1 || i+n == j){
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                 }
             }
             System.out.println();
         }
         for (int i = 0; i < n; i++){
             for (int j = 0; j < 2*n; j++){
                 if (i == j || i+j == 2*(n)-1){
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                 }
             }System.out.println();
         }
	}
	
	
	// TRIANGLE 10 📐
	
    // *
    // **
    // ***
    // **
    // *
	public static void marioTriangle7(int n) {
//         for (int i = 0; i < n; i++) {
//             if (i <= (n / 2 - 1)) {
//                 for (int j = 0; j < i; j++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             } else {
//                 for (int j = 0; j < (n - i); j++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
     
//         More Cleaner Code --------------------------------------------------
//         for (int i = 0; i < n; i++) {
//             int stars;
//             if (i <= (n/2-1)){
//                 stars = i;
//             } else {
//                 stars = n-i;
//             }
//             for (int j = 0; j < stars; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
         
         
//         Other Approach-----------------------------------------------------
//         for (int i = 0; i < 2 * n; i++) {
//             int stars;
//             if (i < n){
//                 stars = i;
//             } else {
//                 stars = (2 * n - i);
//             }
//             for (int j = 0; j < stars; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
	}
	
	
	
	// TRIANGLE 11 📐
	// 1          1
	// 1 2      2 1
	// 1 2 3  3 2 1
	public static void numberTriangle3(int n) {
         for (int i = 0; i < n; i++) {
             int x = 1;
             int y = 1;
             for (int j = 0; j < 2*n; j++){
                 if (i >= j){
                         System.out.print(x);
                         x+=1;
                 } else {
                         System.out.print(" ");
                 }
                 if (i+j > 2*(n-1)){
                         System.out.print(x-1);
                         x-=1;
                 } else {
                         System.out.print(" ");
                 }
             }
             System.out.println();
         }
	}
	
	
	
	// TRIANGLE 12 📐
	
    // 1
    // 01
    // 101
    // 0101
    // 10101
	public static void numberTriangle4(int n) {
         int start = 1;
         for (int i = 0; i < n; i++) {
             if (i % 2 == 0) {
                 start = 0;
             } else {
                 start = 1;
             }
             for (int j = 0; j < i; j++) {
                 System.out.print(start);
                 start = 1 - start;
             }
             System.out.println();
         }
	}
	
	
	
	// TRIANGLE 13 📐
	
    // A
    // AB
    // ABC
    // ABCD
    // ABCDE
    // ABCDEF
	
	public static void marioTriangle8(int n) {
//         for (int i = 0; i < n; i++){
//             for (char c = 'A'; c < 'A'+i; c++){
//                 System.out.print(c);
//             }
//             System.out.println();
//         }
         
		

//      Other Pattern-----------------------------------------------------
//      
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
//		GGGGGGG
//		HHHHHHHH
          char c = 'A';
          for (int i = 1; i <= n; i++){
              for (int j = 0; j < i; j++){
                  System.out.print(c);
              }
              System.out.println();
              c+=1;
          }
	}
	
	
	
	// TRIANGLE 14 📐
	
    // E
    // DE
    // CDE
    // BCDE
    // ABCDE
	public static void marioTriangle9(int n) {
         for (int i = 0; i < n; i++){
             char c = (char)('A'+(n-1));
             for (int j = i; j >= 0; j--){
                 System.out.print((char)(c-j));
             }
             System.out.println();
         }
	}
      

	
	// TRIANGLE 15 📐
	
//  A
// ABA
//ABCBA
//ABCDCBA
	public static void marioTriangle10(int n) {
         for (int i = 0; i < n; i++){
             for (int k = n-i; k > 0; k--){
                 System.out.print(" ");
             }

             char c = 'A';
             int bp = (2*i+1)/2;
             for (int j = 0; j < 2*i+1; j++){
                 System.out.print(c);
                 if (j < bp){
                    c+=1;
                 } else {
                    c-=1;
                 }
             }
             System.out.println();
         }
	}
	
	
	
	// TRIANGLE 16 📐
	
	// *              *
	// * *          * *
	// * * *      * * *
	// * * * *  * * * *
	// * * *      * * *
	// * *          * *
	// *              *
	public static void marioTriangle11(int n) {
//         for (int i = 0; i < n; i++){
//             for (int j = 0; j < 2*n; j++){
//                 if (i >= j){
//                    System.out.print("*");
//                 } else {
//                    System.out.print(" ");
//                 }
//
//                 if (i+j >= 2*n-1){
//                    System.out.print("*");
//                 } else {
//                    System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//
//         for (int i = 1; i <= n; i++){
//             for (int j = 0; j < 2*n; j++){
//                 if (i+j <= n-1){
//                    System.out.print("*");
//                 } else {
//                    System.out.print(" ");
//                 }
//
//                 if (i+n <= j){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
         
         
         // -----------------------METHOD-II-------------------------------------------------
          int spaces = 2*n-2;
          for (int i = 1; i <= 2*n; i++){
              int stars;
              if (i > n){
                  stars = (2*n-i);
              } else {
                  stars = i;
              }

              for (int j = 1; j <= stars; j++){
                  System.out.print("*");
              }

              for (int j = 1; j <= spaces; j++){
                  System.out.print(" ");
              }

              for (int j = 1; j <= stars; j++){
                  System.out.print("*");
              }
              System.out.println();

              if (i < n){
                  spaces-=2;
              } else {
                  spaces+=2;
              }
          }
	}
	
	
	

	// TRIANGLE 17 📐
	
	// 3 3 3 3 3 
	// 3 2 2 2 3
	// 3 2 1 2 3
	// 3 2 2 2 3
	// 3 3 3 3 3
	public static void marioTriangle12(int n) { 
//         first i would subtract 4/n from every value...

//         n - curr_val ===> new_matrix;  ----> let n = 4;   (4 - curr_val ===> new_matrix);
//         n - new_matrix => curr_val; -----> (4 - new_matrix ===> curr_val), Basically i would get every value.....

         for (int i = 0; i < 2*n-1; i++){
             for (int j = 0; j < 2*n-1; j++){
                 int top = i;
                 int left = j;
                 int right = (2*n-1)-1-j;
                 int bottom = (2*n-1)-1-i;

                 System.out.print(n - Math.min(Math.min(left, right), Math.min(top, bottom)) + " ");
             }
             System.out.println();
         }

         for (int i = 0; i < 2*n-1; i++){
             for (int j = 0; j < 2*n-1; j++){
                 int top = i;
                 int left = j;
                 int right = (2*n-1)-1-j;
                 int bottom = (2*n-1)-1-i;

                 System.out.print(n - Math.min(Math.min(left, right), Math.min(top, bottom)) + " ");
             }
             System.out.println();
         }
	}

}









