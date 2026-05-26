package practice4;

import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {
	public static void main(String[] args) {
		int[] arr = {1,2,2,1,3};
		List<Integer> res = majorityElement(arr);
		System.out.println("Result: " + res);
	}
		
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int n = nums.length, a = 0, b = 0, c = 0, d = 0;


        for (int i = 0; i < n; i++){
            if (c == 0 && nums[i] != b){
                a = nums[i];c++;
            } else if (d == 0 && nums[i] != a){
                b = nums[i];d++;
            } else if (a == nums[i]){
                c++;
            } else if (b == nums[i]){
                d++;
            } else {
                c--;d--;
            }
        }

        c = 0; d = 0; // reset

        // recount
        for (int x: nums){
            if(x == a) c++;
            else if (x == b) d++;
        }
        
        if (c > n/3)res.add(a);
        if (d > n/3)res.add(b);

        return res;
    }
}
