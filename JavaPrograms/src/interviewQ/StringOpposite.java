package interviewQ;

import java.util.*;

public class StringOpposite {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		String[] strarr = str.split(" ");
		String revStr = "";
		for (int i = strarr.length - 1; i >= 0; i--) {
			revStr += strarr[i] + " ";
		}
		System.out.println(revStr);
	}
}
