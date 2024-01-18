package interviewQ;

public class FirstandLastOccurenceOfString {

	static int first = -1;
	static int last = -1;

	public static void main(String[] args) {
		String str = "abaacdaefaah";
		char element = 'a';
		findOccurence(str, 0, element);

	}

	private static void findOccurence(String str, int index, char element) {
		if (index == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}

		char currChar = str.charAt(index);
		if (currChar == element) {
			if (first == -1) {
				first = index;
			} else {
				last = index;
			}
		}
		findOccurence(str, index + 1, element);

	}

}
