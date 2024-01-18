package Recursion_DP;

import java.util.Arrays;

public class MaximumSumofNonAdjacentElementsDp {

	public static void main(String[] args) {
		int[] arr = { 9, 9, 8, 2 };
		int result = maximumNonAdjacentSum(arr);
		System.out.println(result);
	}

	private static int maximumNonAdjacentSum(int[] arr) {
		int n = arr.length;
		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		int ans = solve(arr, n - 1, dp);
		return ans;
	}

	private static int solve(int[] arr, int n, int dp[]) {

		// base case
		if (n < 0)
			return 0;
		if (n == 1)
			return arr[0];

		if (dp[n] != -1)
			return dp[n];

		int include = solve(arr, n - 2, dp) + arr[n];
		int exclude = solve(arr, n - 1, dp) + 0;
		dp[n] = Math.max(include, exclude);
		return dp[n];
	}
}
