package PractiseSet;

public class MergeSort2 {

public static void main(String[]args) {
		
		int arr[]= {3,0,6,2,1,7,0,9,8,4};
		int size= arr.length;
		
		mergeSort(arr,0,size-1);
		
		System.out.println("Print sorted Array");
		for(int x=0;x<size;x++) {
			System.out.print(arr[x]);
		}
	}

	//divide the unsorted array
	private static void mergeSort(int[] arr, int left,int right) {
		
		if(left>=right) {
	       return;
		}
		
		if(left<right) {
		int mid = left + (right-left)/2;		
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		merge(arr,left ,mid, right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int leftSide = left;
		int rightSide = mid+1;
		int merge[] = new int[right-left+1];
		int x=0;
		
		while(leftSide <= mid && rightSide <= right) {
			if(arr[leftSide] <= arr[rightSide]) {
				merge[x++] = arr[leftSide++];
			}
			else {
				merge[x++] = arr[rightSide++];
			}
		}
		while(leftSide <= mid) {
			merge[x++]= arr[leftSide++];
		}
		while(rightSide <= right) {
			merge[x++] = arr[rightSide++];
		}
		
		//coping the merged array value into the original array
		for(int i=0,j=left;i<merge.length;i++,j++) {
			arr[j]=merge[i];
		}
	}

}
