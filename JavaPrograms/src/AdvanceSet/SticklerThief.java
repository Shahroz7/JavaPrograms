package AdvanceSet;

public class SticklerThief {

	// int arr[] = {5,10,10,100,10,5};

	public static int FindMaxSum(int arr[], int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return arr[0];
		if (n == 2)
			return Math.max(arr[0], arr[1]);

//		1st approach
//		-------------------------------------------------------------------------------
//		Time Complexity : T(n) = O(n), single traversal.
//		Space Complexity : A(n) = O(n), for table[].
		
//		int b[] = new int[n];
//		b[0] = arr[0];
//		b[1] = Math.max(arr[0], arr[1]);
//		
//		for (int i = 2; i < n; i++) {
//			b[i] = Math.max(b[i - 2] + arr[i], arr[i - 1]);
//		}
//		return b[n - 1];

		
//2nd approach		
//-------------------------------------------------------------------------------------		
		//Time Complexity : T(n) = O(n), single traversal.
		//Space Complexity : A(n) = O(1), used only two extra variables .
		int val1 = arr[0];
		int val2 = Math.max(arr[0], arr[1]);
		int maxLoot = 0;
		for(int i=2;i<n;i++) {
			maxLoot= Math.max(arr[i]+val1, val2);
			val1=val2;
			val2=maxLoot;
		}
		return maxLoot;
	}

	public static void main(String[]args) {
		//int result[]=new int[10];
		int arr[] = {5,10,10,100,10,5};
		int n= arr.length;
		 System.out.println(FindMaxSum(arr,n));
	}

}
