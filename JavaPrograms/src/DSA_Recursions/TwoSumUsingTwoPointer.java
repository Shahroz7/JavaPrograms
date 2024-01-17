package DSA_Recursions;

import java.util.Arrays;

public class TwoSumUsingTwoPointer {
	public static void main(String[] args) {
		int arr[] = { 4, 1, 2, 3, 1 };
		int target = 5;
		System.out.println((twoSum(arr, target)));
	}

	static String twoSum(int[] arr, int target) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				return "YES";
			} else if (sum < target)
				left++;
			else
				right--;
		}
		return "NO";
	}
}
