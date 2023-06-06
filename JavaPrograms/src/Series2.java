import java.util.*;

public class Series2 {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int i=0,flag,j=0,count=0,x=0;
		for(i=2;true;i++){
			flag=1;
			for(j=2;j<=i/2;j++){
				if(i%j==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				count++;
				if(count%4!=0){
					System.out.println(i);
					x++;
				}
			}
			if(x==n)
				break;
		}
	}

}
