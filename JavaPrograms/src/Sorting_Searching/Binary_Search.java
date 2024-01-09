package Sorting_Searching;

public class Binary_Search {

	public static void main(String[] args) {

		int arr[] = { 0, 2, 4, 6, 7, 9, 10 };
		int key = 8;
		bSearch(arr, key);
	}

	private static void bSearch(int[] arr, int key) {

		int size = arr.length;
		int left = 0;
		int right = size - 1;
		int mid = 0;

		while (left <= right) {
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				System.out.println("Element Found at index: " + mid);
				break;
			} else if (arr[mid] > key) {
				right--;
			} else {
				left++;
			}

		}
	}

}
