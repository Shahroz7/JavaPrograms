import java.util.*;

public class Series1 {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n.");
		int n=scan.nextInt();
		int a=1;
		int b=1;
		int c=1;
		int i=0;
		for(i=0;i<n;i++){
		if(i<2)
			System.out.println(a);
		else{
			c=a+b;
			if((i+1)%4==0)
				c=c*4;
				System.out.println(c);
				a=b;
				b=c;
		}
		
	}
 }
}
