package Recursion_DP;

import java.util.Arrays;

public class MinimumCoinsDp {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int sum = 7;
		int ans = minimimCoins(arr, sum);
		System.out.println(ans);
	}

	private static int minimimCoins(int[] arr, int sum) {
		int[] dp = new int[10];
		Arrays.fill(dp, -1);
		int ans = solve(arr, sum, dp);
		if (ans == Integer.MAX_VALUE)
			return -1;
		return ans;
	}

	private static int solve(int[] arr, int sum, int[] dp) {

		// base case
		if (sum == 0)
			return 0;
		if (sum < 0)
			return Integer.MAX_VALUE;

		if (dp[sum] != -1)
			return dp[sum];

		int mini = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int ans = solve(arr, sum - arr[i], dp);
			if (ans != Integer.MAX_VALUE)
				mini = Math.min(mini, 1 + ans);
		}
		dp[sum] = mini;

		return mini;
	}

}
