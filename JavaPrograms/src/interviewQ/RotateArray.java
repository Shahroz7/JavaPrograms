package interviewQ;

import java.util.Arrays;

//TC= O(k*n)
public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 3;
		System.out.println("Before Rotation");
		System.out.println(Arrays.toString(arr));
		rotate(arr, k);
		System.out.println("After Rotation");
		System.out.println(Arrays.toString(arr));

	}

	private static void rotate(int[] arr, int k) {
		k = k % arr.length;
		if (k < 0)
			k = k + arr.length;
		for (int i = 1; i <= k; i++)
			rotateFunc(arr);
	}

	private static void rotateFunc(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
	}

}
