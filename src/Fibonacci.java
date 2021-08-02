import java.util.Scanner;

public class Fibonacci {
        public static void main(String[]args){
        	Scanner scan=new Scanner(System.in);
        	System.out.println("---FIBONACCI SERIES---");
        	int n=0;
        	System.out.println("Enter value for looping");
        	n=scan.nextInt();
            myFibo(n);	
        }
        static void myFibo(int num){
        	int a=0,b=1,sum=0;
        	System.out.println("The Series is");
        	System.out.println(a);
        	System.out.println(b);
        	for(int i=1;i<=(num-2);i++){
        		sum=a+b;
        		System.out.println(sum);
        		a=b;
        		b=sum;
        	}
        	System.out.println();
        }
}
