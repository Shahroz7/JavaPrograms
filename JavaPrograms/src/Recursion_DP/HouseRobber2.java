package Recursion_DP;

import java.util.ArrayList;

public class HouseRobber2 {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 9, 3, 1 };
		long result = houseRobber(arr);
		System.out.println(result);
	}

	static long houseRobber(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return 0;
		if (n == 1)
			return arr[0];
		if (n == 2)
			return Math.max(arr[0], arr[1]);

		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (i != 0)
				first.add(arr[i]);
			if (i != n - 1)
				second.add(arr[i]);

		}
		return Math.max(solveHouseRobber(first), solveHouseRobber(second));
	}

	static long solveHouseRobber(ArrayList<Integer> arr) {

		int n = arr.size();
		long prev1 = arr.get(0);
		long prev2 = 0;
		for (int i = 1; i < n; i++) {

			long include = prev2 + arr.get(i);
			long exclude = prev1 + 0;
			long ans = Math.max(include, exclude);
			prev2 = prev1;
			prev1 = ans;
		}
		return prev1;
	}
}
