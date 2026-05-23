package practice5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/next-permutation/description/

public class nextPermutation {
	public static void main(String[] args) {
		int[] nums = {1,1,5};
		
		
		// SOLUTION I ✨ [TLE: DOESN'T WORKS😅]
        List<List<Integer>> list = new ArrayList<>();
        findPermute(nums, nums.length, list, 0);

        List<Integer> current = Arrays.stream(nums).boxed().toList();

        list.sort((list1, list2) -> {
            int size = Math.min(list1.size(), list2.size());
            for (int i = 0; i < size; i++) {
                int cmp = list1.get(i).compareTo(list2.get(i));
                if (cmp != 0)
                    return cmp;
            }

            return Integer.compare(list1.size(), list2.size());
        });

        int n = list.size();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (list.get(i).equals(current)) {
                if (i == n - 1) {
                    ans = list.get(0);
                } else {
                    ans = list.get(i + 1);
                }
            }
        }

        int s = ans.size();
        for(int i = 0; i < s; i++){
            nums[i] = ans.get(i);
        }
        
        
        
        
        
        //SOLUTION II ✨
		//findPermute2(nums);
        
        
		System.out.println(Arrays.toString(nums));
        
	}

	
	
	
	
	//SOLUTION I ✨ [THIS WILL CAUSE TLE, BUT WILL TEACH HOW TO GENERATE ALL PERMUTATIONS OF AN ARRAY💡]
	
	// time complexity : O(n! * n)💖
	// space complexity: O(n)✨
	public static void findPermute(int[] arr, int n, List<List<Integer>> myList, int start) {
		if (start == n) {
			List<Integer> res = new ArrayList<>();
			for (int x: arr) {
				res.add(x);
			}
			myList.add(res);
			return;
		}
		
		for (int i = start; i < n; i++) { 
			swap(arr, i, start); 
			findPermute(arr, n, myList, start+1);
			swap(arr, i, start); // BACKTRACKING
		}
	}
	
	// time complexity : O(1)💖
	// space complexity: O(1)✨
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
	
	
	
	//SOLUTION II ✨
	
	
	
	// INTUTION✨
	
	//You can think of the next permutation as: 
    //	The smallest possible number, That is GREATER than the current number OR the closest bigger arrangement.
	
	
//	Why is [1,3,2] the NEXT permutation of [1,2,3] ?
//
//			Think in dictionary order (lexicographical order).
//
//			Just like words in a dictionary:
//
//			abc
//			acb
//			bac
//			bca
//			cab
//			cba
//
//
//			Permutations of [1,2,3] are ordered like:
//
//			123
//			132
//			213
//			231
//			312
//			321
	
//	━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//	QUESTION:
//	Why does 132 come immediately after 123 ?
//	━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//	Starting array:
//
//	123
//
//
//	We want:
//	the SMALLEST number greater than 123.
//
//
//	Possible greater permutations are:
//
//	132
//	213
//	231
//	312
//	321
//
//
//	Now compare them:
//
//	132 - 123 = smallest increase ✔
//	213 - 123 = much larger
//	231 - 123 = larger
//	312 - 123 = even larger
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void findPermute2(int[] arr) {
		int n = arr.length, leftSmallIdx = -1;
		
		for (int i = n-2; i >= 0; i--) {
			if (arr[i] < arr[i+1]) {
				leftSmallIdx = i;
				break;
			}
		}
		
		if (leftSmallIdx == -1) {
			reverse(arr, 0, n-1);
			return;
		}
		
		for (int i = n-1; i > leftSmallIdx; i--) {
			if (arr[i] > arr[leftSmallIdx]) {
				int temp = arr[i];
				arr[i] = arr[leftSmallIdx];
				arr[leftSmallIdx] = temp;
				break;
			}
		}
		
		reverse(arr, leftSmallIdx+1, n-1);
		
	}
	
	// time complexity : O(n)💖
	// space complexity: O(1)✨
	public static void reverse(int[] arr, int l, int r) {
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

}













//DRY RUN OF SOLUTION I ✨
//findPermute(arr, n, list, start)
//
//Input:
//arr = [1,2,3]
//n = 3
//start = 0
//
//Initial call:
//findPermute(arr, 3, list, 0)
//
//Initial list:
//list = []
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//LEVEL 0 → start = 0
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Goal:
//Fix the element at index 0.
//
//Loop:
//for (int i = 0; i < 3; i++)
//
//
//══════════════════════════════════════
//CASE 1 → i = 0
//══════════════════════════════════════
//
//swap(arr, 0, 0)
//
//Array:
//[1,2,3]
//
//Recursive call:
//findPermute(arr, 3, list, 1)
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//LEVEL 1 → start = 1
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Goal:
//Fix the element at index 1.
//
//Loop:
//for (int i = 1; i < 3; i++)
//
//
//══════════════════════════════════════
//CASE 1.1 → i = 1
//══════════════════════════════════════
//
//swap(arr, 1, 1)
//
//Array:
//[1,2,3]
//
//Recursive call:
//findPermute(arr, 3, list, 2)
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//LEVEL 2 → start = 2
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Goal:
//Fix the element at index 2.
//
//Loop:
//for (int i = 2; i < 3; i++)
//
//
//══════════════════════════════════════
//CASE 1.1.1 → i = 2
//══════════════════════════════════════
//
//swap(arr, 2, 2)
//
//Array:
//[1,2,3]
//
//Recursive call:
//findPermute(arr, 3, list, 3)
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//BASE CASE → start == n
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//start = 3 | n = 3
//
//Condition: if (start == n)  | TRUE ✔
//
//Create copy of current array: [1,2,3]
//
//Add into list:
//list = [
//  [1,2,3]
//]
//
//Return to previous recursive call.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//BACKTRACKING
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//We return to:
//start = 2
//
//Undo previous swap:
//
//swap(arr, 2, 2)
//
//Array:
//[1,2,3]
//
//Loop ends.
//
//Return to previous level.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//BACKTRACK TO LEVEL 1
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//We return to:
//start = 1
//
//Undo previous swap:
//
//swap(arr, 1, 1)
//
//Array:
//[1,2,3]
//
//Continue loop.
//
//
//
//══════════════════════════════════════
//CASE 1.2 → i = 2
//══════════════════════════════════════
//
//swap(arr, 2, 1)
//
//Array becomes:
//[1,3,2]
//
//Recursive call:
//findPermute(arr, 3, list, 2)
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//LEVEL 2 AGAIN
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Loop:
//for (int i = 2; i < 3; i++)
//
//
//
//══════════════════════════════════════
//CASE 1.2.1 → i = 2
//══════════════════════════════════════
//
//swap(arr, 2, 2)
//
//Array:
//[1,3,2]
//
//Recursive call:
//findPermute(arr, 3, list, 3)
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//BASE CASE
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Current permutation:
//[1,3,2]
//
//Add into list:
//
//list = [
//  [1,2,3],
//  [1,3,2]
//]
//
//Return.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//BACKTRACKING
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Undo swap:
//
//swap(arr, 2, 2)
//
//Return to previous level.
//
//Undo earlier swap:
//
//swap(arr, 2, 1)
//
//Array restored:
//[1,2,3]
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//IMPORTANT IDEA 💡
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//At every recursive level:
//
//1. Fix one position
//2. Recursively solve remaining positions
//3. Backtrack to restore original array
//
//This line performs BACKTRACKING:
//
//swap(arr, i, start);
//
//after recursion returns.
//
//Without backtracking, future recursive calls
//would work on a modified array and generate
//incorrect permutations.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//RECURSION TREE
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//                    [1,2,3]
//                  /    |     \
//               fix1   fix2   fix3
//                |
//             [1,2,3]
//            /       \
//      [1,2,3]    [1,3,2]
//
//
//Eventually generated permutations:
//
//[1,2,3]
//[1,3,2]
//[2,1,3]
//[2,3,1]
//[3,1,2]
//[3,2,1]
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//TIME COMPLEXITY
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Total permutations:
//n!
//
//Copying each permutation:
//O(n)
//
//Overall:
//O(n! * n)
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//SPACE COMPLEXITY
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Recursive stack:
//O(n)
//
//Storing all permutations:
//O(n! * n)







//💡------------------------------------------------------------------------------------------------------------------💡





//DRY RUN OF SOLUTION I ✨
//
//INTUITION OF NEXT PERMUTATION
//
//Goal:
//Find the VERY NEXT greater arrangement
//of the array in dictionary order
//(lexicographical order).
//
//
//Example:
//
//[1,2,3]
//↓
//[1,3,2]
//↓
//[2,1,3]
//↓
//[2,3,1]
//↓
//[3,1,2]
//↓
//[3,2,1]
//
//
//We do NOT want:
//- all permutations
//- sorting all permutations
//- brute force
//
//We only want:
//the immediate next permutation.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//MAIN OBSERVATION 💡
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//If we move from RIGHT → LEFT:
//
//some suffix is already in DESCENDING order.
//
//Example:
//
//[1,2,5,4,3]
//
//Right side:
//5,4,3
//
//is decreasing.
//
//Why is this important?
//
//Because:
//5,4,3 is already the BIGGEST arrangement
//possible using those digits.
//
//So changing only that suffix cannot produce
//a larger permutation.
//
//We must change something BEFORE it.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//STEP 1 → FIND BREAKPOINT
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Find first index from right where:
//
//arr[i] < arr[i+1]
//
//Example:
//
//[1,2,5,4,3]
//
//Checking from right:
//
//5 > 4
//4 > 3
//BUT:
//
//2 < 5 ✔
//
//So:
//2 is the breakpoint.
//
//
//Visual:
//
//1  2  5  4  3
//   ↑
//first smaller element from right
//
//
//This means:
//We can make the permutation slightly bigger
//by increasing this number.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//STEP 2 → FIND NEXT GREATER ELEMENT
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Now we need a number JUST GREATER than 2.
//
//Right side contains:
//
//5,4,3
//
//Smallest greater number is:
//3
//
//Swap them.
//
//
//After swap:
//
//[1,3,5,4,2]
//
//
//Why smallest greater?
//
//Because we want:
//NEXT permutation
//
//not:
//a much larger permutation.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//STEP 3 → MAKE RIGHT PART MINIMUM
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Current array:
//
//[1,3,5,4,2]
//
//Right part:
//5,4,2
//
//This is still in DESCENDING order
//(biggest arrangement).
//
//To get the NEXT permutation,
//we need the SMALLEST arrangement
//after index 1.
//
//So reverse it.
//
//
//Reverse:
//5,4,2
//→
//2,4,5
//
//
//Final answer:
//
//[1,3,2,4,5]
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//WHY REVERSING WORKS 💡
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//The suffix is ALWAYS decreasing.
//
//Example:
//
//5,4,2
//
//Reversing decreasing order gives
//increasing order:
//
//2,4,5
//
//which is the smallest possible arrangement.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//COMPLETE THOUGHT PROCESS
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//1. Find first place from right
//   where array can be increased.
//
//2. Increase it slightly
//   using next greater element.
//
//3. Minimize remaining suffix.
//
//
//This guarantees:
//the immediate next permutation.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//EDGE CASE
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Input:
//
//[5,4,3,2,1]
//
//Entire array is decreasing.
//
//Meaning:
//This is already the largest permutation.
//
//So next permutation becomes:
//
//[1,2,3,4,5]
//
//by reversing the whole array.
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//TIME COMPLEXITY
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//Finding breakpoint:
//O(n)
//
//Finding next greater:
//O(n)
//
//Reversing suffix:
//O(n)
//
//Overall:
//O(n)
//
//
//
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//SPACE COMPLEXITY
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//
//O(1)
//
//No extra array used.

