import java.util.*;

class Replace{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		System.out.println("The original String-: "+s);
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='a' || c[i]=='A'){
				c[i]='x';
			}
		}
		String s2=String.valueOf(c);
		System.out.println("Replaced String-: "+s2);
	}
}