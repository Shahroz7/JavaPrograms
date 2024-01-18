package AdvanceSet;

import java.util.Arrays;

public class FirstAndLastElementInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		int target = 5;
		int result[] = searchRange(arr, target);
		System.out.println(Arrays.toString(result));
	}

	static int[] searchRange(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		int res[] = { -1, -1 };

		while (left <= right) {
			mid = (left + right) / 2;

			if (target == arr[mid]) {
				res[0] = mid;
				right = mid - 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		// reinitialize variables again
		left = 0;
		right = arr.length - 1;
		mid = 0;

		while (left <= right) {
			mid = (left + right) / 2;

			if (target == arr[mid]) {
				res[1] = mid;
				left = mid + 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return res;
	}

}
