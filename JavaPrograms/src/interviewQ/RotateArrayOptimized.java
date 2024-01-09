package interviewQ;

import java.util.Arrays;

//TC= O(n)
public class RotateArrayOptimized {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 3;
		System.out.println("Before Rotate");
		System.out.println(Arrays.toString(arr));
		rotate(arr, k);
		System.out.println("After Rotate");
		System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int[] arr, int k) {
		k = k % arr.length;
		if (k < 0)
			k = k + arr.length;
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	private static void reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
