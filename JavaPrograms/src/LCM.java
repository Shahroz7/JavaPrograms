import java.util.*;

public class LCM {
	public static void main(String[]args){
		int n1,n2,i,gcd=0,lcm=0;
		System.out.println("Enter two no.");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(i=1;i<=n1 && i<=n2;i++){
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
			lcm=(n1*n2)/gcd;
			System.out.println("The LCM is"+lcm);
			System.out.println("The HCF is"+gcd);
		}
}
