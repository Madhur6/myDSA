package practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
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
		
		
		System.out.println(countFrequency3(arr));
	}
	
	
	// https://www.geeksforgeeks.org/problems/frequency-count/1
	// Given an integer array arr[], you need to find frequency of each element and return in an arraylist in the order they appear.
	// time complexity : O(n)💖
	// space complexity: O(n)✨
	public static ArrayList<Integer> countFrequency3(int[] arr) {
		
		int len = arr.length;
		ArrayList<Integer> myList = new ArrayList<>();
		Map<Integer, Integer> myMap = new LinkedHashMap<>();
		
		for (int i = 0; i < len; i++) {
			if (!myMap.containsKey(arr[i])) {
				myMap.put(arr[i], 0);
			} myMap.put(arr[i], myMap.get(arr[i])+1);
		}
		
		for (Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
			myList.add(entry.getValue());
		}
		
		return myList;
	}
	
	
	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
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

	
	// time complexity : O(n)💖
	// space complexity: O(n)✨
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
