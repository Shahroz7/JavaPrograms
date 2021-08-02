package interviewQ;
import java.util.*;

class StringRev{
	
	void strRev(){
	System.out.println("Enter the String");
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	System.out.println("String is :"+s);
	int len=s.length();
	int i;
	String rev="";
	for(i=len-1;i>=0;i--){
		rev=rev+s.charAt(i);
	}
	System.out.println("Reverse String: "+rev);
	if(s.equals(rev))
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
	}
  }

class StringPalin{
	public static void main(String[]args){
		StringRev st=new StringRev();
		st.strRev();
	}
}