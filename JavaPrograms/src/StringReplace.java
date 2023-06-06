import java.util.*;
class CharR
{
	void compute(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		String []s=str.split(" ");
		int len=s.length;
		String temp="";
		for(int i=0;i<len;i++){
			if(s[i].matches("Hello"))
				s[i]="Hola";
				temp=temp+s[i]+" ";
		}
		System.out.println(temp);
	}
}
class StringReplace{
	public static void main(String[]args){
		CharR cr=new CharR();
		cr.compute();
	}
}