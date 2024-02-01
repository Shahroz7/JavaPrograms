package Heaps;

public class Heapsort {

	void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2 * i; // Adjust for 0-indexed array
		int right = 2 * i + 1; // Adjust for 0-indexed array

		if (left <= n && arr[largest] < arr[left]) {
			largest = left;
		}

		if (right <= n && arr[largest] < arr[right]) {
			largest = right;
		}

		if (largest != i) {
			swap(arr, largest, i); // Pass indices, not values
			heapify(arr, n, largest);
		}
	}

	void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	void heapsort(int arr[], int n) {
		for (int i = n / 2; i >= 1; i--) { // Build max heap
			heapify(arr, n, i);
		}

		int size = n;
		while (size > 1) {
			swap(arr, 1, size); // Swap root (max element) with the last element
			size--;
			heapify(arr, size, 1); // Heapify the reduced heap
		}
	}

	public static void main(String[] args) {
		Heapsort h = new Heapsort();

		int arr[] = { -1, 54, 53, 55, 52, 50 };
		int n = arr.length - 1;

		System.out.println("Array before sorting:");
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		h.heapsort(arr, n);

		System.out.println("Array after sorting:");
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
