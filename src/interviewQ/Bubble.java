package interviewQ;
import java.util.*;

class BubbleS {
	public void bubbleSort(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value of array");
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
public class Bubble{
	public static void main(String[]args){
		BubbleS bs=new BubbleS();
		bs.bubbleSort();
	}
}