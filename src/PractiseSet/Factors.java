package PractiseSet;
import java.util.*;

public class Factors {
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=scan.nextInt();
	System.out.println("The factors are := ");
	for(int i=1;i<=a/2;i++){
		if(a%i==0)
			System.out.println(i);
	}
  }
}
