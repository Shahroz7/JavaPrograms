package Recursion_DP;

import java.util.Arrays;
import java.util.HashMap;

//using hashing = hashmap
public class TwoSumUsingMap {

	public static void main(String[] args) {
		int arr[] = { 4, 1, 2, 3, 1 };
		int target = 5;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}

	private static int[] twoSum(int[] arr, int target) {

		HashMap<Integer, Integer> hmap = new HashMap<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			int more = target - arr[i];

			if (hmap.containsKey(more)) {
				return new int[] { hmap.get(more), i };
			} else {
				hmap.put(arr[i], i);
			}

		}
		return new int[] {};
	}

}
