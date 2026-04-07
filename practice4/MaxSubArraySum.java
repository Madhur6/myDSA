package practice4;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int[] arr = {-71, 92, 0, 67, -8, 67, -78, -7};
		int n = arr.length;
		find4(arr, n);
	}
	// Kadane's Algorithm 🧙‍♂️ (Print the SubArrays)
	// If we want to print the sub-array
	// If we carefully observe, Our sub-array's starting-idx is where the sum is 0 &
	// ending index, the index where sum exceeds the prev-max.
	public static void find4(int[] arr,int n) {
		int max = Integer.MIN_VALUE, sum = 0, start = -1, s = -1, e = -1;
		for (int i = 0; i < n; i++) {
			if (sum == 0) {
				start = i;
			}
			
			sum += arr[i];
			
			if (sum > max) {
				max = sum;
				
				// Intution ✨
				s = start;
				e = i;
			}
			
			if (sum < 0) {
				sum = 0;
			}
		}
		
		for (int i = s; i <= e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// Kadane's Algorithm 🧙‍♂️
	// We do not consider -ve sum
	// Edge case 📖:
	//	- {-1, -4, -5}
	// 		0   1   2
	//      i
	//  sum = -5
	//  max = -1 (returns this✨ -> Incorrect😑)
	public static void find3(int[] arr, int n) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			
			if (sum > max) {
				max = sum;
			}
			
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(max);
		
		// Edge case 📖:
		// 	-If empty subArray Sum is considered ?
		// System.out.println(Math.max(0, max));
	}
	
	// If we need to find the sum of current-sub-array
	// We just need to add the current element to the previous subArray sum
	// -> sumOfSubArr[i,j] = sumOfSubArr[i,j-1] + arr[j]
	public static void find2(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int s = 0;
			for (int j = i; j < n; j++) {
				s += arr[j];
				
				max = Math.max(s, max);
			}
		}
		System.out.println(max);
	}
	
	// NOT REALLY EFFICIENT 😑
	public static void find(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		// -2,1,-3,4,-1,2,1,-5,4
		//  i
		//         j
		//         k
		//  s = -2 + 1
		//  m = 0
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int s = 0;
				for (int k = i; k <= j; k++) {
					s += arr[k];
				}
				max = Math.max(s, max);
			}
		}
		System.out.println(max);
	}
}
