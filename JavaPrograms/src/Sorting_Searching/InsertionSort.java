package Sorting_Searching;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6 };
		insertionSort(arr);

	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = current;
		}

		System.out.println("Sorted Array using Bubble Sort: ");
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
