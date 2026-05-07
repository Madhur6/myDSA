package practice2;

import java.util.Arrays;

//https://leetcode.com/problems/sort-an-array/description/

public class countingSort {
	public static void main(String[] args) {
		int[] arr = {7,8,5,6,4,3,1,2};
		
		sort2(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	// 💡 General Counting Sort
	public static int[] sort3(int[] nums) {
		int n = nums.length, max = Arrays.stream(nums).max().orElse(-1), min = Arrays.stream(nums).min().orElse(-1);

        int[] count = new int[max+1];
        int[] countM = new int[Math.abs(min)+1];

        for (int i = 0; i < n; i++){
            if (nums[i] < 0){
                countM[Math.abs(nums[i])]+=1;
            } else {
                count[nums[i]]+=1;
            }
        }

        int cLen = count.length, cLen2 = countM.length, c = 0;

        for (int i = cLen2-1; i > 0; i--){
            while (countM[i] > 0){
                nums[c] = i*(-1);
                countM[i]-=1;
                c++;
            }
        }

        for (int i = 0; i < cLen; i++){
            while(count[i] > 0){
                nums[c] = i;
                count[i]-=1;
                c++;
            }
        }
        return nums;
	}
	
	
	
	
	// ✨ Stable Counting Sort
	
	// Works for both (-ve & +ve)
	public static void sort2(int[] arr) {
		int len = arr.length;
		int[] output = new int[len];
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		
		int[] count = new int[max+1];
		int cLen = count.length;
		
		for (int i = 0; i < len; i++) {
			count[arr[i]-min]+=1;
		}
		
		for (int i = 1; i < cLen; i++) {
			count[i] += count[i-1];
		}
		
		int i = len-1;
		while (i >= 0) {
			output[count[arr[i]-min]-1] = arr[i];
			count[arr[i]-min]-=1;
			i--;
		}
		
		for (int x = 0; x < len; x++) {
			arr[x] = output[x];
		}
	}
	
	
	// Only for non-negatives...
	public static void sort(int[] arr) {
		int len = arr.length;
		int[] output = new int[len];
		
		int max = Arrays.stream(arr).max().orElse(-1);
		
		int[] count = new int[max+1];
		int cLen = count.length;
		
		for (int i = 0; i < len; i++) {
			count[arr[i]]+=1;
		}
		
		for (int i = 1; i < cLen; i++) {
			count[i] += count[i-1];
		}
		
		int i = len-1;
		while (i >= 0) {
			output[count[arr[i]-1]] = arr[i];
			count[arr[i]]-=1;
			i--;
		}
		
		for (int x = 0; x < len; x++) {
			arr[x] = output[x];
		}
	}
}






