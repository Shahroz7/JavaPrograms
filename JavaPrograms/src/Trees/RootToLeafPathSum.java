package Trees;

public class RootToLeafPathSum {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		// If the current node is a leaf and its value equals the remaining sum, we
		// found a path
		if (root.left == null && root.right == null && root.val == sum) {
			return true;
		}
		// Recursively check the left and right subtrees for the remaining sum
		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}

	// Sample main method to test the code
	public static void main(String[] args) {
		/*
		 * 5 / \ 4 8 / / \ 11 13 4 / \ \ 7 2 1
		 */
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.right.right = new TreeNode(1);

		int targetSum = 22;

		RootToLeafPathSum pathSumChecker = new RootToLeafPathSum();
		boolean hasPath = pathSumChecker.hasPathSum(root, targetSum);

		if (hasPath) {
			System.out.println("There exists a root-to-leaf path with sum " + targetSum);
		} else {
			System.out.println("No root-to-leaf path with sum " + targetSum + " exists");
		}
	}
}