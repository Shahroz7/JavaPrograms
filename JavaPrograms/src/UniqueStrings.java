import java.util.Scanner;

class UniqueStrings{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First String");
		String s1=scan.nextLine();
		System.out.println("Enter Second String");
		String s2=scan.nextLine();
		System.out.println("The first String is-: "+s1);
		System.out.println("The second String is-: "+s2);
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
		char c1[]=s3.toCharArray();
		char c2[]=s4.toCharArray();
		if(c1.length==c2.length){
		for(int i=0;i<c1.length;i++){
			for(int j=0;j<c2.length;j++){
				if(c1[i]==c2[j]){
						c1[i]=' ';
						c2[j]=' ';		
					}
			  }
		  }
		String str1=String.valueOf(c1);
		String str2=String.valueOf(c2);
		System.out.println();
		System.out.println("The replaced String1 is : "+str1);
		System.out.println("The replaced String2 is : "+str2);
		}
		else
			System.out.println("!!!Enter Strings of same length");
	}
}