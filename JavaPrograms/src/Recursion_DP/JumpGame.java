package Recursion_DP;

//Greedy
public class JumpGame {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 2, 1, 2, 1 };
		System.out.println(minimumJump(arr));
	}

	static int minimumJump(int[] arr) {
		int n = arr.length;
		int jumps = 0;
		int maxReach = 0;
		int current = 0;
		for (int i = 0; i < n-1; i++) {
			maxReach = Math.max(maxReach, i + arr[i]);
			if (maxReach >= n - 1)
				return 1 + jumps;
			if (i == maxReach)
				return -1;
			if (i == current) {
				jumps++;
				current = maxReach;
			}

		}
		return current;
	}

}
