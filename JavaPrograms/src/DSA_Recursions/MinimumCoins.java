package DSA_Recursions;

public class MinimumCoins {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int sum = 7;
		int ans = minimimCoins(arr, sum);
		System.out.println(ans);
	}

	private static int minimimCoins(int[] arr, int sum) {
		int ans = solve(arr, sum);
		if (ans == Integer.MAX_VALUE)
			return -1;
		return ans;
	}

	private static int solve(int[] arr, int sum) {

		// base case
		if (sum == 0)
			return 0;
		if (sum < 0)
			return Integer.MAX_VALUE;

		int mini = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int ans = solve(arr, sum - arr[i]);
			if (ans != Integer.MAX_VALUE)
				mini = Math.min(mini, 1 + ans);
		}

		return mini;
	}

}
