package AdvanceSet;

import java.util.PriorityQueue;

public class KthLargestElement {

	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	
	public int add(int num, int k) {
		
		if(minHeap.size()<k) {
			minHeap.add(num);
			return minHeap.size() == k ? minHeap.peek() : -1;
		}
		if(num>minHeap.peek()) {
			minHeap.poll();
			minHeap.add(num);
		}
		return minHeap.peek();
	}
	
	public static void main(String[]args) {
		
		int arr[] = {10,7,9,4,8,3,2};
		int k=3;
		int kthelement = 0;
		KthLargestElement kelement = new KthLargestElement();
		
		for(int i=0;i<arr.length;i++) {
			kthelement = kelement.add(arr[i],k);
		}
		System.out.println("element is-: "+ kthelement);
			
	}
}
