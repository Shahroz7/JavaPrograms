package Heaps;

public class MinHeap {

	int arr[] = new int[100];
	int size;

	MinHeap() {
		arr[0] = Integer.MIN_VALUE; // Set the first element to a minimum value for comparison
		size = 0;
	}

	void heapify(int arr[], int n, int i) {
		int smallest = i;
		int left = 2 * i;
		int right = 2 * i + 1;

		if (left < n && arr[left] < arr[smallest]) {
			smallest = left;
		}

		if (right < n && arr[right] < arr[smallest]) {
			smallest = right;
		}

		if (smallest != i) {
			swap(arr, smallest, i);
			heapify(arr, n, smallest);
		}
	}

	void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		MinHeap mh = new MinHeap();

		System.out.println("This is minheap");
		int arr[] = { -1, 54, 53, 55, 52, 50 };
		int n = arr.length - 1;

		for (int i = n / 2; i > 0; i--) { // Start from the last non-leaf node
			mh.heapify(arr, n, i);
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
