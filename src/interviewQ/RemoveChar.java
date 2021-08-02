package interviewQ;
import java.util.*;

public class RemoveChar {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String s=scan.nextLine();
		System.out.println(removeDuplicate(s));
	}
	public static String removeDuplicate(String str){
		Set<Character> set=new HashSet<Character>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++){
			Character c=str.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
	}
}
