package Recursion_DP;

public class RainTrapWater {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int result = trap(arr);
		System.out.println(result);
	}

	static int trap(int[] arr) {

		int i = 0;
		int j = arr.length - 1;
		int maxLeft = 0;
		int maxRight = 0;
		int water = 0;

		while (i < j) {
			if (arr[i] <= arr[j]) {
				maxLeft = Math.max(maxLeft, arr[i]);
				water += maxLeft - arr[i];
				i++;
			}

			else {
				maxRight = Math.max(maxRight, arr[j]);
				water += maxRight - arr[j];
				j--;
			}
		}
		return water;

	}

}
