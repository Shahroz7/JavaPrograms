import java.util.*;

class Merge{
	
}
public class MergeSort {
	static void mergeS(int arr[],int low,int high){
		int size=arr.length;
		if(low<high){
			int middle=(low+high)/2;
			mergeS(arr,low,middle);
			mergeS(arr,middle+1,high);
			mSort(arr,low,middle,high);
		}
	}
	static void mSort(int arr[],int low,int middle,int high){
		int size=arr.length;
		int i=0;
		int temp[]=new int [size];
		for(i=low;i<=high;i++){
		    temp[i]=arr[i];
		    i=low;
		    int j=middle+1;
		    int k=low;
		while(i<=middle && j<=high){
			if(temp[i]<=temp[j]){
				arr[k]=temp[i];
				++i;
			}
			else{
				arr[k]=temp[j];
				++j;
			}
			++k;
		}
		while(i<=middle){
			arr[k]=temp[i];
			++k;
			++i;
		}
	}
  }
	
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
		}
		int low=0,high=arr.length-1;
		//Merge m=new Merge();
		mergeS(arr,low,high);
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
