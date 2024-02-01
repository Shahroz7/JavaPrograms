package Heaps;

public class HeapifyAlgo {

	int arr[] = new int[100];
	int size;

	HeapifyAlgo() {
		arr[0] = Integer.MIN_VALUE; // Set the first element to a minimum value for comparison
		size = 0;
	}

	void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2 * i; // Adjust for 0-indexed array
		int right = 2 * i + 1; // Adjust for 0-indexed array

		if (left < n && arr[largest] < arr[left]) {
			largest = left;
		}

		if (right < n && arr[largest] < arr[right]) {
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

	public static void main(String[] args) {
		HeapifyAlgo h = new HeapifyAlgo();

		int arr[] = { -1, 54, 53, 55, 52, 50 };
		int n = arr.length - 1;

		for (int i = n / 2; i > 0; i--) { // Start from the last non-leaf node
			h.heapify(arr, n, i);
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}