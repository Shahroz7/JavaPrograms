import java.util.*;

public class PalinNumber {
	static int rev=0,mod;
	public static int myPal(int n){
		if(n!=0){
			mod=n%10;
			rev=rev*10+mod;
			myPal(n/10);
		}
		return rev;
	 }
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("---PALINDROME USING RECURSION---");
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int result=myPal(num);
		System.out.println("Reverse is: "+result);
		if(num==result)
		    System.out.println("Palindrome");
		else
			System.out.println("not a Palidrome");
	}
}
