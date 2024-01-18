package interviewQ;

public class SecondLargestArray {

	public static void main(String[] args) {

		int a[] = { 3, 5, 2, 7, 9, 8 };
		// Arrays.sort(a);
		int temp = 0;
		int total = a.length;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int c = a[a.length - 2];
		int d = a[a.length - 1];
		System.out.println(c);
		System.out.println(d);
	}
}
