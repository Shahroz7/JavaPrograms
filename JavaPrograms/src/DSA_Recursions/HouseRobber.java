package DSA_Recursions;

//Stickler Thief
public class HouseRobber {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 9, 3, 1 };
		int result = houseRobber(arr);
		System.out.println(result);
	}

	private static int houseRobber(int[] arr) {

		int n = arr.length;
		int prev1 = arr[0];
		int prev2 = 0;
		for (int i = 1; i < n; i++) {
			
			int include = prev2 + arr[i];
			int exclude = prev1 + 0;
			int ans = Math.max(include, exclude);
			prev2 = prev1;
			prev1 = ans;
		}
		return prev1;
	}
}
