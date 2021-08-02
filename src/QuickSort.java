import java.util.*;

class Quick{
	void qSort(int arr[],int left,int right){
		int i=left;
		int j=right;
		int temp=0;
		int pivot=arr[(left+right)/2];
		while(i<=j){
			while(arr[i]<pivot)
			    i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(left<j)
			qSort(arr,left,j);
		if(i<right)
			qSort(arr,i,right);
	}
	    void display(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
	   }
	}
}
public class QuickSort {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		System.out.println("Enter the elements in the array");
		int arr[]=new int[n];
		int len=arr.length;
		for(int i=0;i<len;i++){
			arr[i]=scan.nextInt();
		}
		Quick q=new Quick();
		q.qSort(arr,0,len-1);
		q.display(arr);
     }
}
