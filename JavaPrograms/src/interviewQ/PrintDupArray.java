package interviewQ;

import java.util.*;

public class PrintDupArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		int size = arr.length;
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Elements after initial input");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if (set.add(arr[i]) == false)
				System.out.println("Duplicate Array found: " + arr[i]);
		}
	}
}
