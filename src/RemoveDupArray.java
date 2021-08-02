import java.util.*;

public class RemoveDupArray {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values in the array");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		System.out.println("Array after the inital inputs");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		int size=arr.length;
		System.out.println("Array Size before Deletion: "+size);
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					while(j<(size)-1){
						arr[j]=arr[j+1];
						j++;
					} 
					size--;	
				}
			}
		}
		System.out.println("Array after deletion of duplicates");
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
		System.out.println("Size after deletion: "+ size);
	}
}
