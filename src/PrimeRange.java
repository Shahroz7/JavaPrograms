import java.util.Scanner;
class PrimeRange{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		int i,j,p=0;
		for(i=2;i<=n;i++){
		if(isP(i)){
		System.out.println(i);
		}	
	  }
	}
	public static boolean isP(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}