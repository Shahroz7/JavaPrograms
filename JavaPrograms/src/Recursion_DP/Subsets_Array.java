package Recursion_DP;

import java.util.ArrayList;
import java.util.List;

public class Subsets_Array {

	public static void main(String[] args) {
		
		int input[] = {1,2,3};
		System.out.println(subsets(input));
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
	       
		List<List<Integer>> ans = new ArrayList<>();
			List<Integer> output = new ArrayList<Integer>();
			int index = 0;
			solve(nums, output,index, ans);
			return ans;	
	    }

	private static void solve(int[] input, List<Integer> output, int index, List<List<Integer>> ans) {
			
			//base case
			if(index >= input.length) {
				ans.add(new ArrayList<Integer>(output));
				return;
			}
		
			//include
			output.add(input[index]);
			solve(input, output, index+1, ans);

    	  	//exclude
			output.remove(output.size()-1);
			solve(input, output, index+1, ans);
	
		}

}
