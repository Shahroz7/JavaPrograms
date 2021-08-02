import java.util.*;

public class GCD {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("---GCD---");
		System.out.println("Enter the 2 numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int result;
		while(n2!=0){
			result=n1%n2;
			n1=n2;
			n2=result;
		}
		System.out.println("GCD="+n1);
	}

}
