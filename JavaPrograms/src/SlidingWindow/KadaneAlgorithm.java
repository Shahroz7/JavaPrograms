package SlidingWindow;

//Maximum Subarray Sum //Largest Sum Contiguous Subarray
public class KadaneAlgorithm {
	public static int maxSubarraySum(int[] nums) {

		int maxEndingHere = 0;
		int maxSoFar = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	public static void main(String[] args) {

		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int maxSum = maxSubarraySum(arr);
		System.out.println("The maximum subarray sum is: " + maxSum);
	}
}