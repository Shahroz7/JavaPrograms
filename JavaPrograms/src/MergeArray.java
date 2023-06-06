
import java.util.*;

public class MergeArray {
	public static void main(String[]args){
		int i,j;
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter Size of array 1 ");
	    int n1=scan.nextInt();
	    int ar1[]=new int[n1];
	    System.out.println("Enter array 1");
	    for(i=0;i<n1;i++){
	    	ar1[i]=scan.nextInt();
	    }
	    System.out.println("Enter Size of array 2 ");
	    int n2=scan.nextInt();
	    int ar2[]=new int[n2];
	    System.out.println("Enter array 2");
	    for(j=0;j<n2;j++){
	    	ar2[j]=scan.nextInt();
	    }
	    
	    for(j=0;j<n2;j++){
	    	ar1[i]=ar2[j];
	    	i++;
	    }
	    System.out.println("Before sorting");
	    for(i=0;i<(n1+n2);i++){
	    	System.out.println(ar1[i]);
	    }
	}
}
