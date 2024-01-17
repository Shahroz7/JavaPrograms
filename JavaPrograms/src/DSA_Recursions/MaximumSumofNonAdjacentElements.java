package DSA_Recursions;

public class MaximumSumofNonAdjacentElements {

	public static void main(String[] args) {
		int[] arr = { 9, 9, 8, 2 };
		int result = maximumNonAdjacentSum(arr);
		System.out.println(result);
	}

	private static int maximumNonAdjacentSum(int[] arr) {
		int n = arr.length;
		int ans = solve(arr, n - 1);
		return ans;
	}

	private static int solve(int[] arr, int n) {

		// base case
		if (n < 0)
			return 0;
		if (n == 1)
			return arr[0];

		int include = solve(arr, n - 2) + arr[n];
		int exclude = solve(arr, n - 1) + 0;
		return Math.max(include, exclude);
	}

}
