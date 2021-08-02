package interviewQ;
import java.util.*;

class RemoveDupStrings{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Strings");
		String s=scan.nextLine();
		String sarr[]=s.split(" ");
		HashSet<String> hs=new HashSet<String>();
		s="";
		for(String x:sarr){
			if(hs.add(x)==true){
				s=s+x+" ";
			}
		}
		System.out.println(s);
	}
}