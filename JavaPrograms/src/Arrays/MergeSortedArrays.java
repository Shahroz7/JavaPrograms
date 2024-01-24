package Arrays;

//O(m + n)
public class MergeSortedArrays {

	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] result = new int[len1 + len2];

		int i = 0, j = 0, k = 0;

		while (i < len1 && j < len2) {
			if (arr1[i] <= arr2[j]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}

		// If there are remaining elements in nums1 or nums2, add them to the result
		while (i < len1) {
			result[k++] = arr1[i++];
		}

		while (j < len2) {
			result[k++] = arr2[j++];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 5, 7, 9 };
		int[] nums2 = { 2, 4, 6, 8, 9 };

		int[] mergedArray = mergeSortedArrays(nums1, nums2);

		// Print the merged array
		for (int num : mergedArray) {
			System.out.print(num + " ");
		}
	}

}
