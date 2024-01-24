package Stacks;

import java.util.Stack;

public class CelebrityProblem {

	private static boolean[][] knows;

	public static int findCelebrity(int n) {
		Stack<Integer> stack = new Stack<>();

		// Step 1: Push all people onto the stack
		for (int i = 0; i < n; i++) {
			stack.push(i);
		}

		// Step 2: Pop off pairs until only one person remains
		while (stack.size() > 1) {
			int a = stack.pop();
			int b = stack.pop();

			// If a knows b, a cannot be the celebrity, push b back
			if (knows(a, b)) {
				stack.push(b);
			} else {
				// If a doesn't know b, b cannot be the celebrity, push a back
				stack.push(a);
			}
		}

		// Step 3: The remaining person on the stack may be the celebrity
		int potentialCelebrity = stack.pop();

		// Step 4: Verify if the potential celebrity is known by everyone
		for (int i = 0; i < n; i++) {
			if (i != potentialCelebrity && (knows(potentialCelebrity, i) || !knows(i, potentialCelebrity))) {
				return -1; // No celebrity found
			}
		}

		return potentialCelebrity; // Found a celebrity
	}

	// Example usage
	public static void main(String[] args) {
		// Example array "knows" (replace this with your actual implementation)
		// For simplicity, a dummy array is used, where knows[a][b] is true if a knows b
		knows = new boolean[][] { { false, true, false, true }, { false, false, false, true },
				{ false, true, false, true }, { false, false, false, false } };

		int n = knows.length;
		int celebrity = findCelebrity(n);

		if (celebrity != -1) {
			System.out.println("Celebrity found: " + celebrity);
		} else {
			System.out.println("No celebrity found");
		}
	}

	// Replace this method with your actual implementation of the knows function
	private static boolean knows(int a, int b) {
		// This is a dummy implementation; replace it with your actual implementation
		return knows[a][b];
	}

}
