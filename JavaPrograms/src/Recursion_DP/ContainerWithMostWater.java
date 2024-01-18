package Recursion_DP;

//Using 2-pointer
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int result = containerWater(arr);
		System.out.println(result);
	}

	static int containerWater(int[] arr) {
		int maxArea = 0;
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] < arr[right]) {
				maxArea = Math.max(maxArea, arr[left] * (right - left));
				left++;
			} else {
				maxArea = Math.max(maxArea, arr[right] * (right - left));
				right--;
			}
		}
		return maxArea;
	}

}
