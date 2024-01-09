package interviewQ;

import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = scan.nextLine();
		System.out.println("Enter Second String");
		String s2 = scan.nextLine();
		boolean check = anaCheck(s1, s2);
		System.out.println(check);
	}

	public static boolean anaCheck(String str1, String str2) {
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		return Arrays.equals(c1, c2);
	}
}