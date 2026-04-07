package practice2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class highLowFreq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.print("Enter " + (i+1) + " element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		countFrequency(arr);
		
		countFrequency2(arr);
	}
	
	public static void countFrequency2(int[] arr) {
		int len = arr.length;
		
		boolean[] visited = new boolean[len];
		
		int max = 0, min = Integer.MAX_VALUE;
		int maxElement = 0, minElement = 0;
		for (int i = 0; i < len; i++) {
			if (visited[i] == true) {
				continue;
			}
			
			int c = 0;			
			for (int j = i; j < len; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					c++;
				}
			}
			
			System.out.println("Element " + arr[i] + " count " + c);
			
			if (c > max) {
				max = c;
				maxElement = arr[i];
			}
			if (c < min) {
				min = c;
				minElement = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum frequency: " + max + " (" + maxElement + ")");
		System.out.println("Minimum frequency: " + min + "(" + minElement + ")");
	}
	
	public static void countFrequency(int[] arr) {
		int len = arr.length;
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i < len; i++) {
			if(!hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], 0);
			}
			hashMap.put(arr[i], hashMap.get(arr[i])+1);
		}
		
		System.out.println(hashMap);
		
		
		int max = 0, min = Integer.MAX_VALUE;
		int maxElement = 0, minElement = 0;
		for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
			int count = entry.getValue();
			int element = entry.getKey();
			
			if (count > max) {
				max = count;
				maxElement = element;
			}
			
			if (count < min) {
				min = count;
				minElement = element;
			}
		}
		
		System.out.println("Maximum frequency: " + max + " (" + maxElement + ")");
		System.out.println("Minimum frequency: " + min + "(" + minElement + ")");
	}
}









