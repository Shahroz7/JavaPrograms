import java.util.*;

public class Sum {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int result=mySum(num);
        System.out.println("Sum is: "+result);
	}
	public static int mySum(int n){
		if(n!=0){
			return (n%10+mySum(n/10));
		}
		else
			return 0;
	}

}
