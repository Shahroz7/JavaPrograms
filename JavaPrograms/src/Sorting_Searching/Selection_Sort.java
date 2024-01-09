package Sorting_Searching;

public class Selection_Sort {

	public static void main(String[] args) {

		int arr[] = { 4, 0, 2, 3, 6, 7, 9, 5 };
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}

			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}

		System.out.println("Sorted Array using Bubble Sort: ");
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
