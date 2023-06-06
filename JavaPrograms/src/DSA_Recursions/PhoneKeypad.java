package DSA_Recursions;

import java.util.ArrayList;

public class PhoneKeypad {

	public static void main(String[] args) {
		
		String input = "23";
		System.out.println(letterCombination(input));
	}

	private static ArrayList<String> letterCombination(String input) {
		
		ArrayList<String> ans = new ArrayList<>();
		StringBuilder output= new StringBuilder();
		int index=  0;
		String mapping [] = {"", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
		if(input == null || input.length() == 0  )
			return ans;
		solve(input, output, index, ans, mapping);
		return ans;	
	}

	private static void solve(String input, StringBuilder output, int index, ArrayList<String> ans, String[] mapping) {
		
		if(index >= input.length()) {
			ans.add(output.toString());
			return;
		}
		
		int number = input.charAt(index) - '0';
		String values = mapping[number];
		
		for(char value : values.toCharArray()) {
			output.append(value);
			solve(input, output, index+1, ans, mapping);
			output.deleteCharAt(output.length()-1);
		}
		
	}

}
