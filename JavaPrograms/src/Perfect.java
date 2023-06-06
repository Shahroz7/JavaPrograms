import java.util.*;

class PNumber{
	public void perfectNumber(){
		int s=0,i=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		while(i<n){
			if(n%i==0)
			s=s+i;
			i++;
		}
		if(i==s)
			System.out.println("Number is perfect");
		else
			System.out.println("Number is not perfect");
	}
}
public class Perfect {
	public static void main(String[]args){
		PNumber pn=new PNumber();
		pn.perfectNumber();
	}

}
