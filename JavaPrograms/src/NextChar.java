import java.util.*;

class NextChar{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		char c[]=s.toCharArray();
		String r="";
		for(int i=0;i<c.length;i++){
			int ascii=c[i]+1;
			r=r+(char)ascii;
		}
		System.out.println(r);
	}
}