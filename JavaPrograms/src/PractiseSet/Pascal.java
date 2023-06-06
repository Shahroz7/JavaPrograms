package PractiseSet;
import java.util.*;

public class Pascal {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int number=1;
		System.out.println("Enter size");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
			number=1;
			for(int j=0;j<=i;j++){
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
