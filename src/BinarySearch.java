import java.util.*;

class BSearch{
	void bSearch(){
		System.out.println("Enter the value of n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=0;
		
		System.out.println("Enter Elements in the array in ascending order");
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the Number to be searched");
		int key=scan.nextInt();
		
		int mid=0;
		int start=0,end=n-1;
		
		while(start<=end){
			mid=(start+end)/2;
			if(arr[mid]==key){
				System.out.println(key+" Element found at: "+(mid+1));
				break;
			}
			else if(arr[mid]<key)
				start=mid+1;
			
			else
				end=mid-1;
		}
		if(start>end)
			System.out.println("Search Unsuccessfull");
	}
}

public class BinarySearch {
	public static void main(String[]args){
		BSearch s=new BSearch();
		s.bSearch();                                                         	
	}
}
