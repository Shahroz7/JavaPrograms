import java.util.*;

public class Floyd {
	public static void main(String[]args){
		int num,j,i,k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		num=sc.nextInt();
		for(i=1;i<=num;i++){
			for(j=1;j<=i;j++){
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
	}

}
