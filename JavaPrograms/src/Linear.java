import java.util.*;

class Search {
	public void LinearSearch() {
		System.out.println("---LINEAR SEARCH---");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int arr[] = new int[40];
		int i;
		System.out.println("Enter the value in array");
		for (i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int key;
		System.out.println("Enter the value to be searched");
		key = scan.nextInt();

		for (i = 0; i < n; i++) {
			if (arr[i] == key) {
				System.out.println("The Element has been found at position " + (i + 1));
				break;
			}
		}
		if (i == n)
			System.out.println("The Seached failed");
	}
}

public class Linear {
	public static void main(String[] args) {
		Search sc = new Search();
		sc.LinearSearch();
	}
}