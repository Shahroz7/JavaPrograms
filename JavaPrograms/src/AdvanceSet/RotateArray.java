package AdvanceSet;

class RotateArray {

	static void RightRotate(int a[], int n, int k) {
		k = k % n;
		for (int i = 0; i < n; i++) {
			if (i < k) {
				System.out.print(a[n + i - k] + " ");
			} else {
				
				System.out.print(a[i - k] + " ");
			}
		}
		System.out.println();
	}

// Driver program
	public static void main(String args[]) {
		int Array[] = { 1, 2, 3, 4, 5 };
		int N = Array.length;

		int K = 1;
		RightRotate(Array, N, K);

	}
}