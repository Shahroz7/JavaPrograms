package Trees;

class TreeNode {
	int data;
	TreeNode left, right;

	public TreeNode(int item) {
		data = item;
		left = right = null;
	}
}

public class LeftView {
	static int maxLevel = 0;

	public static void printLeftView(TreeNode node) {
		printLeftViewUtil(node, 1);
	}

	static void printLeftViewUtil(TreeNode node, int level) {
		if (node == null)
			return;

		// If this is the first node of its level
		if (maxLevel < level) {
			System.out.print(node.data + " ");
			maxLevel = level;
		}

		// Recur for left and right subtrees
		printLeftViewUtil(node.left, level + 1);
		printLeftViewUtil(node.right, level + 1);
	}

	public static void main(String[] args) {
		// Creating a sample binary tree
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(10);
		root.right = new TreeNode(30);
		root.right.left = new TreeNode(25);
		root.right.right = new TreeNode(40);

		// Calling the printLeftView method
		printLeftView(root);
	}
}