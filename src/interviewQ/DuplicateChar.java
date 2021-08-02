package interviewQ;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateChar {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s = scan.nextLine();
		printDuplicateCharacters(s);
	}

	public static void printDuplicateCharacters(String str) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++)
			lhs.add(str.charAt(i));

		for (Character ch : lhs)
			System.out.print(ch);

	}
}
