import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for factorial");
		num = sc.nextInt();
		Factorial f = new Factorial();
		f.myFact(num);
		System.out.println("Factorial is-" + f.myFact(num));
	}

	public int myFact(int n) {
		if (n == 1) {
			return 1;
		} else
			return n * myFact(n - 1);
	}
}
