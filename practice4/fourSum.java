package practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
	public static void main(String[] args) {
		int[] arr = {1000000000,1000000000,1000000000,1000000000};
		int n = arr.length, target = -294967296;
		find(arr, n, target);
	}
	
	public static void find(int[] arr, int n, int target) {
		long s = 0;
		Arrays.sort(arr);
		
		List<List<Integer>> res = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			if (i > 0 && arr[i] == arr[i-1]) {continue;}
			for(int j = i+1; j < n; j++) {
				if(j > i+1 && arr[j] == arr[j-1]) {continue;}
				int p = j+1, q = n-1;
				while (p < q) {
					s = (long) arr[i] + arr[j] + arr[p] + arr[q];

// In Java, int overflow does not throw an error — it silently wraps around.
// So by the time you check if (s > Integer.MAX_VALUE), 
// the overflow has already happened, meaning the check is useless.
//                    if (s > Integer.MAX_VALUE || s < Integer.MIN_VALUE){
//                        s = 0;
//                    }
// So instead, Use Long 😊
					if (s > target) {
						q--;
					} else if (s < target) {
						p++;
					} else {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[p] + " " + arr[q] + " | " + s);
						res.add(Arrays.asList(arr[i], arr[j], arr[p], arr[q]));
						p++;
						while (p < q && arr[p] == arr[p-1]) {
							p++;
						}
					}
				}
			}
		}
		System.out.println(res);
	}
}
