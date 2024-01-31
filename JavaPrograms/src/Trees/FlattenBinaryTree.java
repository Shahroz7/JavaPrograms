package Trees;

class FlattenBT {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}
		flatten(root.left);
		flatten(root.right);

		TreeNode left = root.left;
		TreeNode right = root.right;

		// Make the left subtree as the right subtree of the root
		root.left = null;
		root.right = left;

		// Find the rightmost node of the current root
		TreeNode current = root;
		while (current.right != null) {
			current = current.right;
		}

		// Attach the right subtree to the rightmost node of the left subtree
		current.right = right;
	}
}

public class FlattenBinaryTree {
	public static void main(String[] args) {
		/*
		 * 1 / \ 2 5 / \ \ 3 4 6
		 */
		FlattenBT.TreeNode root = new FlattenBT.TreeNode(1);
		root.left = new FlattenBT.TreeNode(2);
		root.right = new FlattenBT.TreeNode(5);
		root.left.left = new FlattenBT.TreeNode(3);
		root.left.right = new FlattenBT.TreeNode(4);
		root.right.right = new FlattenBT.TreeNode(6);

		FlattenBT flattenBinaryTree = new FlattenBT();
		flattenBinaryTree.flatten(root);

		// Print the flattened tree
		FlattenBT.TreeNode current = root;
		while (current != null) {
			System.out.print(current.val + " -> ");
			current = current.right;
		}
	}
}