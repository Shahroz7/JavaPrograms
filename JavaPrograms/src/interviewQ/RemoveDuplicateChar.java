package interviewQ;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s = scan.nextLine();
		duplicateCharactersRemove(s);
	}

	public static void duplicateCharactersRemove(String str) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++)
			lhs.add(str.charAt(i));

		for (Character ch : lhs)
			System.out.print(ch);

	}
}
