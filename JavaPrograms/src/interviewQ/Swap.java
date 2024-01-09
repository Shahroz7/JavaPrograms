package interviewQ;

import java.util.*;

class Swapped {
	public static void swapping() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of two numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

//		n1 = n1 ^ n2;
//		n2 = n1 ^ n2;
//		n1 = n1 ^ n2;
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;

		System.out.println("After swapping");
		System.out.println("First no. " + n1);
		System.out.println("Second no. " + n2);
	}
}

public class Swap {
	public static void main(String[] args) {
		Swapped.swapping();
	}
}
