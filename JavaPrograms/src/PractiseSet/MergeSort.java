package PractiseSet;

public class MergeSort {
	
	//follow divide and conquer approach
	public static void main(String[]args) {
		
		int arr[]= {3,0,6,2,1,7,0,8,4};
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

	//merge the sorted array;
	private static void merge(int[] arr, int left, int mid, int right) {
	
		//for the size of subarray
		int leftSize = mid-left+1;
		int rightSize = right-mid;
		
		//create 2 sub arrays
		int leftArray[] = new int[leftSize];
		int rightArray[] = new int[rightSize];
		
		/*Copy data to temp arrays*/
        for (int i = 0; i < leftSize; ++i)
            leftArray[i] = arr[left+i];
        
        for (int j = 0; j < rightSize; ++j)
            rightArray[j] = arr[mid+1+j];	
        
      //indexes of the arrays;
      	int leftIndex=0,rightIndex=0;
      	int mergeIndex= left;
        
        //merge 2 sorted array
        while(leftIndex < leftSize && rightIndex< rightSize) {
        	if(leftArray[leftIndex]<= rightArray[rightIndex]) {
        		arr[mergeIndex++]= leftArray[leftIndex++];
        	}
        	else {
        	arr[mergeIndex++]=rightArray[rightIndex++];
        	}
        }
        	
		while(leftIndex < leftSize) {
			arr[mergeIndex++] = leftArray[leftIndex++];
			
		}
		while(rightIndex < rightSize) {
			arr[mergeIndex++] = rightArray[rightIndex++];
		}
        	
		
	}

}
