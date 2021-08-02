import java.util.*;

public class CovertLowUp {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		char c[]=s.toCharArray();
		int temp=0;
		String r="";
		for(int i=0;i<c.length;i++){
			temp=c[i];
			temp=temp-32;
		//System.out.println("Upper case of all charatcers "+c[i]+" is:"+(char)temp);
		r=r+(char)temp;
	  }
		System.out.println("UpperCase String is "+ r);
	}
}
