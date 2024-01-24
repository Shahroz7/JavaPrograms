package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;

public class MaximumWindowOfSizeK {

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		LinkedList<Integer> deque = new LinkedList<>();

		for (int i = 0; i < nums.size(); i++) {
			// Remove elements that are out of the current window
			while (!deque.isEmpty() && deque.peek() < i - k + 1) {
				deque.poll();
			}

			// Remove elements from the back of the deque that are smaller than the current
			// element
			while (!deque.isEmpty() && nums.get(deque.peekLast()) < nums.get(i)) {
				deque.pollLast();
			}

			// Add the current index to the deque
			deque.offer(i);

			// Add the maximum element in the current window to the result
			if (i >= k - 1) {
				result.add(nums.get(deque.peek()));
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// Example usage
		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.add(1);
		nums1.add(0);
		nums1.add(1);
		nums1.add(2);
		nums1.add(2);
		nums1.add(2);
		nums1.add(2);
		nums1.add(1);
		nums1.add(0);
		nums1.add(2);

		int k1 = 2;

		ArrayList<Integer> result1 = getMaximumOfSubarrays(nums1, k1);

		System.out.println(result1);

		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(2);
		nums2.add(1);
		nums2.add(0);
		nums2.add(1);
		nums2.add(1);
		nums2.add(0);
		nums2.add(0);
		nums2.add(2);
		nums2.add(2);

		int k2 = 3;

		ArrayList<Integer> result2 = getMaximumOfSubarrays(nums2, k2);

		System.out.println(result2);
	}
}