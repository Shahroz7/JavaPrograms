package Sorting_Searching;

public class QuickSort {

	//Follows divide and conquer approach
	public static void main(String[] args) {
		
		int arr[]= {4,2,3,5,0,1,8,6,0,8,9,1,7};
		int size = arr.length;
		
		quicksort(arr,0,size-1);
		
		for(int x=0;x<size;x++) {
			System.out.println(arr[x]);
		}	
	
	}
    
	//divide the unsorted array 
	private static void quicksort(int[] arr, int low, int high) {

		if(low>= high) {
		      return;
		    }
		
		if(low<high) {
		int pivotIndex= partition(arr,low,high);
		  quicksort(arr, low, pivotIndex-1);
		  quicksort(arr, pivotIndex+1, high);
		 
	   }
	}

	static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int swapIndex = (low-1); // index of smaller element
        for (int j=low; j<high; j++){
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot){
            	swapIndex++; 
            	swap(arr, swapIndex,j);
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        swapIndex++;
        swap(arr,swapIndex,high);
        return swapIndex;
    }

	 static void swap(int[] arr, int i, int j) {
		 int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
	}


}
