package interviewQ;

public class FirstandLastOccurenceofArray {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 7, 3, 9, 3, 5 };
		int targetElement = 3;

		// Finding the first and last occurrences
		int firstOccurrence = findFirstOccurrence(array, targetElement);
		int lastOccurrence = findLastOccurrence(array, targetElement);

		if (firstOccurrence != -1) {
			System.out.println("First occurrence of " + targetElement + ": " + firstOccurrence);
		} else {
			System.out.println(targetElement + " not found in the array.");
		}

		if (lastOccurrence != -1) {
			System.out.println("Last occurrence of " + targetElement + ": " + lastOccurrence);
		} else {
			System.out.println(targetElement + " not found in the array.");
		}
	}

	static int findFirstOccurrence(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1; // Element not found
	}

	static int findLastOccurrence(int[] arr, int target) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1; // Element not found

	}

}
