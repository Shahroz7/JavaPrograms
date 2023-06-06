package interviewQ;
import java.util.*;

public class SecondLast {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		String sarr[]=str.split(" ");
		String lastWord=sarr[sarr.length-2];
		System.out.println(lastWord);
	}
}
