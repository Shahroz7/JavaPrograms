package Recursion_DP;

import java.util.List;
import java.util.ArrayList;

public class Subsets_String {

	public static void main(String[] args) {
		
		String str="abc";
		System.out.println(subsets(str));
	}

	private static List<List<Character>> subsets(String str) {
		
		int index= 0;
		List<Character> output = new ArrayList<Character>();
		List<List<Character>> ans = new ArrayList<>();
		solve(str, output, index, ans);
		return ans;
	}

	private static void solve(String str, List<Character> output, int index, List<List<Character>> ans) {
	
		//base case
		if(index >=str.length()) {
			if(output.size()>0) {
		       ans.add(new ArrayList<Character>(output));
			}
		   return;
		}
		
		output.add(str.charAt(index));
		solve(str, output, index+1, ans);
		
		output.remove(output.size()-1);
		solve(str, output, index+1, ans);
		
	}
}
