import java.util.*;

class InsertionSort{
	void insertSort(){
		System.out.println("Enter the value of n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int i=0,j=0;
		System.out.println("Enter the Elements");
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int element=0;
		for(i=0;i<n;i++){
			element=arr[i];
			j=i;
			{
				while(j>0 && arr[j-1]>element){
					arr[j]=arr[j-1];
					j=j-1;
				}
					arr[j]=element;
			}
		}
		System.out.println("After Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}

public class Insertion {
	public static void main(String[]args){
	InsertionSort is=new InsertionSort();
	is.insertSort();
		
	}
}
