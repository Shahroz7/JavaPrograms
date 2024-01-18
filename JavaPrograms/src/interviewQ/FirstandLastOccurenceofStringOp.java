package interviewQ;

public class FirstandLastOccurenceofStringOp {

	public static void main(String[] args) {
		String str = "abaacdaefaah";
		String substring = "a";

		int firstOccurrence = str.indexOf(substring);
		int lastOccurrence = str.lastIndexOf(substring);

		if (firstOccurrence != -1) {
			System.out.println("First occurrence of '" + substring + "': " + firstOccurrence);
		} else {
			System.out.println("'" + substring + "' not found in the string.");
		}

		if (lastOccurrence != -1) {
			System.out.println("Last occurrence of '" + substring + "': " + lastOccurrence);
		} else {
			System.out.println("'" + substring + "' not found in the string.");
		}
	}

}
