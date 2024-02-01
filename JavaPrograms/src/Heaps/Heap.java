package Heaps;

public class Heap {

	int arr[] = new int[100];
	int size;

	Heap() {
		arr[0] = Integer.MIN_VALUE; // Set the first element to a minimum value for comparison
		size = 0;
	}

	void insert(int val) {
		size = size + 1;
		int index = size;
		arr[index] = val;

		while (index > 1 && arr[index / 2] < arr[index]) { // Check if the parent is smaller
			swap(index / 2, index);
			index = index / 2;
		}
	}

	void delete() {
		if (size == 0) {
			System.out.println("Heap is empty. Cannot delete.");
			return;
		}

		// Replace root with the last element
		arr[1] = arr[size];
		size--;

		// Restore heap property by heapifying down
		heapifyDown(1);
	}

	void heapifyDown(int index) {
		int left = 2 * index;
		int right = 2 * index + 1;
		int largest = index;

		// Find the largest among current node, left child, and right child
		if (left <= size && arr[left] > arr[largest]) {
			largest = left;
		}
		if (right <= size && arr[right] > arr[largest]) {
			largest = right;
		}

		// If the largest is not the current node, swap and continue heapifying down
		if (largest != index) {
			swap(index, largest);
			heapifyDown(largest);
		}
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	void print() {
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[i] + " "); // Use print instead of println to print in one line
		}
		System.out.println(); // Print a newline after printing the heap
	}

	public static void main(String[] args) {
		Heap h = new Heap();

		h.insert(50);
		h.insert(55);
		h.insert(53);
		h.insert(52);
		h.insert(54);

		h.delete();
		h.print();
	}
}
