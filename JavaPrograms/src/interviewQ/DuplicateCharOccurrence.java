package interviewQ;

import java.util.*;

public class DuplicateCharOccurrence {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s = scan.nextLine();
		printDuplicateCharacters(s);
	}

	public static void printDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {	
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", word);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}
}
