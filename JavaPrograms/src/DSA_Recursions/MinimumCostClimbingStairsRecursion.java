package DSA_Recursions;

public class MinimumCostClimbingStairsRecursion {

	public static void main(String[] args) {

		int arr[] = { 10, 15, 20 };
		int ans = minimimCost(arr);
		System.out.println(ans);
	}

	static int minimimCost(int[] cost) {
		int n = cost.length;
		int ans = Math.min(solve(cost, n - 1), solve(cost, n - 2));
		return ans;
	}

	static int solve(int[] cost, int n) {
		// base case
		if (n == 0)
			return cost[0];
		if (n == 1)
			return cost[1];

		int ans = cost[n] + Math.min(solve(cost, n - 1), solve(cost, n - 2));
		return ans;
	}

}
