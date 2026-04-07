package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class hashing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array: " + Arrays.toString(arr));
		
		
		int[] hashmap = new int[13];
		for (int i = 0; i < x; i++) {
			hashmap[arr[i]]+=1;
		}
		
		System.out.println("HashMap: " + Arrays.toString(hashmap));
		
		
		int q = sc.nextInt();
		while (q-- > 0) {
			System.out.print("Enter x: ");
			int number = sc.nextInt();
			
			System.out.println("Data: " + hashmap[number]);
		}
		
	}
}
