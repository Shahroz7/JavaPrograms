package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxWindowSizeK {

	public static ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		Deque<Integer> deque = new ArrayDeque<>();

		for (int i = 0; i < nums.length; i++) {
			// Remove elements that are out of the current window
			while (!deque.isEmpty() && deque.peek() < i - k + 1) {
				deque.poll();
			}

			// Remove elements that are smaller than the current element from the back
			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
				deque.pollLast();
			}

			// Add the current index to the deque
			deque.offer(i);

			// Add the maximum element in the current window to the result
			if (i >= k - 1) {
				result.add(nums[deque.peek()]);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// Example usage
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

		ArrayList<Integer> result = maxSlidingWindow(nums, k);

		System.out.println(result);
	}
}