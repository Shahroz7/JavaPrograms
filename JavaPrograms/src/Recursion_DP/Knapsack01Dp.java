package Recursion_DP;

import java.util.Arrays;

public class Knapsack01Dp {

	public static void main(String[] args) {
		int weight[] = { 10, 20, 30 };
		int n = weight.length;
		int value[] = { 60, 100, 120 };
		int maxWeight = 50;
		int result = knapsack(weight, value, n, maxWeight);
		System.out.println(result);
	}

	static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
		int dp[][] = new int[n + 1][maxWeight + 1];
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		return solve(weight, value, n-1, maxWeight, dp);
	}

	private static int solve(int[] weight, int[] value, int i, int maxWeight, int dp[][]) {
 
		// base case
		if (i == 0) {
			if (weight[0] <= maxWeight)
				return value[0];
			else
				return 0;
		}
		if (dp[i][maxWeight] != -1)
			return dp[i][maxWeight];

		int include = 0;
		if (weight[i] <= maxWeight)
			include = value[i] + solve(weight, value, i - 1, maxWeight - weight[i], dp);

		int exclude = 0 + solve(weight, value, i - 1, maxWeight, dp);
		dp[i][maxWeight] = Math.max(include, exclude);

		return dp[i][maxWeight];
	}

}
