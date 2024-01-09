package PractiseSet;

import java.util.*;

public class SumDiv {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0, div = 0, mod = 0;
		int num = n;
		while (n > 0) {
			mod = n % 10;
			sum = sum + mod;
			n = n / 10;
		}
		System.out.println("Sum is " + sum);
		if (num % sum == 0) {
			System.out.println("Sum is Divisible by number");
		} else
			System.out.println("Not divisible by number");
	}
}
