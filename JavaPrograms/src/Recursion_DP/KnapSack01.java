package Recursion_DP;

public class KnapSack01 {

	public static void main(String[] args) {
		int weight[] = { 10, 20, 30 };
		int n = weight.length;
		int value[] = { 60, 100, 120 };
		int maxWeight = 50;
		int result = knapsack(weight, value, n, maxWeight);
		System.out.println(result);
	}

	static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
		return solve(weight, value, n - 1, maxWeight);
	}

	private static int solve(int[] weight, int[] value, int i, int maxWeight) {

		// base case
		if (i == 0) {
			if (weight[0] <= maxWeight)
				return value[0];
			else
				return 0;
		}

		int include = 0;
		if (weight[i] <= maxWeight)
			include = value[i] + solve(weight, value, i - 1, maxWeight - weight[i]);

		int exclude = 0 + solve(weight, value, i - 1, maxWeight);
		int ans = Math.max(include, exclude);

		return ans;
	}

}
