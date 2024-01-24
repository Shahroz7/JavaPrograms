package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Merge two arrays and remove duplicates
public class MergeTwoSortedArrays2 {

	public static List<Integer> sortedArray(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		List<Integer> mergedList = new ArrayList<>();

		int i = 0, j = 0;

		// Merge arrays into a single list
		while (i < len1 && j < len2) {
			if (nums1[i] < nums2[j]) {
				mergedList.add(nums1[i++]);
			} else if (nums1[i] > nums2[j]) {
				mergedList.add(nums2[j++]);
			} else {
				mergedList.add(nums1[i]); // Add only once in case of duplicates
				i++;
				j++;
			}
		}

		// Add remaining elements from nums1 (if any)
		while (i < len1) {
			mergedList.add(nums1[i++]);
		}

		// Add remaining elements from nums2 (if any)
		while (j < len2) {
			mergedList.add(nums2[j++]);
		}

		// Remove duplicates using Set
		Set<Integer> uniqueSet = new HashSet<>(mergedList);
		mergedList = new ArrayList<>(uniqueSet);

		return mergedList;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 6 };
		int[] nums2 = { 2, 3, 5 };

		List<Integer> mergedList = sortedArray(nums1, nums2);

		// Print the merged list
		System.out.println(mergedList);
	}
}