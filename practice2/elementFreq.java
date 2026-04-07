package practice2;

import java.util.HashMap;
import java.util.Scanner;

public class elementFreq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.print("Enter " + (i+1) + " element: ");
			arr[i] = sc.nextInt();
		}
		
		countFrequency(arr);
		
		
		countFrequency2(arr);
	}
	
	public static void countFrequency2(int[] arr) {
		int len = arr.length;
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i < len; i++) {
			if (!hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], 0);
			}
			hashMap.put(arr[i], hashMap.get(arr[i])+1);
		}
		
		System.out.println("My Map: " + hashMap);
		
	}
	
	public static void countFrequency(int[] arr) {
		int len = arr.length;
		
		boolean[] visited = new boolean[len];
		
		for (int i = 0; i < len; i++) {
			if (visited[i] == true) {continue;}
			
			int c = 0;
			for (int j = i; j < len; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					c++;
				}
			}
			System.out.println("Element " + arr[i] + " count: " + c);
		}
	}
	

	
}
