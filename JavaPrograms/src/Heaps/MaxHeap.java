package Heaps;

public class MaxHeap {

	int arr[] = new int[100];
	int size;

	MaxHeap() {
		arr[0] = Integer.MAX_VALUE; // Set the first element to a maximum value for comparison
		size = 0;
	}

	void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2 * i;
		int right = 2 * i + 1;

		if (left <= n && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right <= n && arr[right] > arr[largest]) {
			largest = right;
		}

		if (largest != i) {
			swap(arr, largest, i);
			heapify(arr, n, largest);
		}
	}

	void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		MaxHeap mh = new MaxHeap();

		System.out.println("This is max heap");
		int arr[] = { Integer.MAX_VALUE, 54, 53, 55, 52, 50 };
		int n = arr.length - 1;

		for (int i = n / 2; i > 0; i--) { // Start from the last non-leaf node
			mh.heapify(arr, n, i);
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
