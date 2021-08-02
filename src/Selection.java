import java.util.*;

public class Selection {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("---SELECTION SORT---");
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the value in the array");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=scan.nextInt();
		}
		SelectionSort(arr1);
	}
		public static void SelectionSort(int arr2[]){
			for(int i=0;i<arr2.length-1;i++){
				int index=i;
				for(int j=i+1;j<arr2.length;j++){
					if(arr2[j]<arr2[index])
						index=j;
				}
				int smallNum=arr2[index];
				arr2[index]=arr2[i];
				arr2[i]=smallNum;
			}
			System.out.println("After Sorting");
			for(int i:arr2)
				System.out.println(i);
		}
}

