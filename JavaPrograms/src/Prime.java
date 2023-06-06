import java.util.Scanner;

public class Prime {
        public static void main(String[]args){
        	System.out.println("---PRIME NUMBERS---");
        	Scanner scan=new Scanner(System.in);
        	int n;
        	System.out.println("Enter the a number");
        	n=scan.nextInt();
        	myPrime(n);
        }
        static void myPrime(int num){
        	int i,flag=0;
        	for(i=2;i<=num/2;i++){
        		if(num%i==0){
        		   flag=1;
        		   break;
        		}
        	}
        	if(flag==0)
        		System.out.println("Number is prime");
        	else
        		System.out.println("Number is not prime");
        }
}
