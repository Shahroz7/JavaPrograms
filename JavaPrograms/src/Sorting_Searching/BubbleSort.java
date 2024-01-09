package Sorting_Searching;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 0, 4, 2, 6, 9, 8, 7, 1, 3 };
		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {

		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array using Bubble Sort: ");
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
