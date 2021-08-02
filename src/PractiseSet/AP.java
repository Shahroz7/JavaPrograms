package PractiseSet;
import java.util.*;

public class AP {
	public static void main(String[]args){
		int t,n=1; 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number in A.P.");
		int a=scan.nextInt();
		System.out.println("Enter difference");
		int d=scan.nextInt();
		System.out.println("Enter the number of terms");
	    int b=scan.nextInt();
	    while(b!=n-1){
	    	t=(a+(n-1)*d);
	    	n++;
	    	System.out.println(t+" ");
	    }
	}

}
