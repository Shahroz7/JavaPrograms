package Arrays;

public class SortZeroandOne {

	public static void main(String[] args) {
		int arrayOne[] = { 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1 };
		countingSort(arrayOne);
		printArray(arrayOne);
	}

	static void countingSort(int[] arr) {
		int countZero = 0;

		// Count the number of 0s
		for (int value : arr) {
			if (value == 0) {
				countZero++;
			}
		}

		// Fill the array with 0s and 1s based on the count
		for (int i = 0; i < countZero; i++) {
			arr[i] = 0;
		}
		for (int i = countZero; i < arr.length; i++) {
			arr[i] = 1;
		}
	}

	static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

}
