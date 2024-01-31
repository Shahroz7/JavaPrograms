package Trees;

import java.util.Stack;

public class BinaryTree {

	private TreeNode root;

	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	public void createBinaryTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);

		root = first;
		first.left = second;
		first.right = third;

		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
	}

	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}

	public void postOrder(TreeNode root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}

   // Level order using Stack
    public void iterativePreOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
		  while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data);
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
    }

//	public void levelOrder() {
//		Queue<TreeNode> q = new LinkedList<>();
//		q.offer(root);
//
//		while (!q.isEmpty()) {
//			TreeNode temp = q.poll();
//			System.out.println(temp.data);
//			if (temp.left != null)
//				q.offer(temp.left);
//			if (temp.right != null)
//				q.offer(temp.right);
//		}
//		return;
//	}

	int countOfNodes(TreeNode root) {
		if (root == null)
			return 0;
		int leftNodes = countOfNodes(root.left);
		int rightNodes = countOfNodes(root.right);
		return leftNodes + rightNodes + 1;
	}

	int sumOfNodes(TreeNode root) {
		if (root == null)
			return 0;
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		return leftSum + rightSum + root.data;
	}

	int height(TreeNode root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int myHeight = Math.max(leftHeight, rightHeight) + 1;
		return myHeight;
	}

	int diameter(TreeNode root) {
		if (root == null)
			return 0;
		int leftDia = diameter(root.left);
		int rightDia = diameter(root.right);
		int diam = height(root.left) + height(root.right) + 1;
		return Math.max(diam, Math.max(leftDia, rightDia));
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createBinaryTree();
		System.out.println("PreOrder");
		tree.preOrder(tree.root);
		System.out.println(" ");
		System.out.println("Post order");
		tree.postOrder(tree.root);
		// tree.iterativePreOrder(tree.root);
		System.out.println("Level order");
		tree.iterativePreOrder(tree.root);
		System.out.println("Count of Nodes");
		System.out.println(tree.countOfNodes(tree.root));
		System.out.println("Sum of Nodes");
		System.out.println(tree.sumOfNodes(tree.root));
		System.out.println("Height of Nodes");
		System.out.println(tree.height(tree.root));
		System.out.println("Diameter of Nodes");
		System.out.println(tree.diameter(tree.root));
	}
}
