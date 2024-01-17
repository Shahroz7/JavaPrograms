package DSA_Recursions;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6, 4 };
		int result = maxProfit(arr);
		System.out.println(result);
	}

	private static int maxProfit(int[] arr) {
		int mini = arr[0];
		int profit = 0;
		for (int i = 1; i < arr.length; i++) {
			int difference = arr[i] - mini;
			profit = Math.max(profit, difference);
			mini = Math.min(mini, arr[i]);
		}
		return profit;
	}

}
 