import java.util.*;

class PrimeP{
	void pPrime(){
		Scanner scan=new Scanner(System.in);
		int i=0;
		int num=0;
		String pnum="";
		System.out.println("Enter limit");
		int n=scan.nextInt();
		for(i=2;i<=n;i++){
			int counter=0;
			for(num=i;num>=1;num--){
				if(i%num==0){
					counter=counter+1;
				}
			}
			if(counter==2){
				pnum=pnum+" "+i+" ";
			}
		}
		System.out.println("Prime numbers till 1000");
		System.out.println(pnum);	
     }
}

public class PrimePro{
	public static void main(String[]args){
		PrimeP p=new PrimeP();
		p.pPrime();
	}
}