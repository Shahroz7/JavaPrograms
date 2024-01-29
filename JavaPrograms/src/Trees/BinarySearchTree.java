package Trees;

public class BinarySearchTree {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	public static Node insert(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}

		if (root.data > val) {
			// left subtree;
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}

	public static Node delete(Node root, int val) {

		if (root == null)
			return null;

		if (root.data > val)
			root.left = delete(root.left, val);

		else if (root.data < val)
			root.right = delete(root.right, val);

		else {
			// case 1
			if (root.left == null && root.right == null)
				return null;

			// case 2
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// case 3
			Node temp = inOrderSuccessor(root.right);
			root.data = temp.data;
			root.right = delete(root.right, temp.data);
		}
		return root;

	}

	public static Node inOrderSuccessor(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	public static boolean search(Node root, int key) {
		if (root == null)
			return false;

		if (root.data > key)
			return search(root.left, key);
		else if (root.data == key)
			return true;
		else
			return search(root.right, key);

	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}

	// main function
	public static void main(String[] args) {
		int arr[] = { 5, 1, 3, 4, 2, 7 };
		Node root = null;

		for (int i = 0; i < arr.length; i++) {
			root = insert(root, arr[i]);
		}

		inOrder(root);
		System.out.println();

		if (search(root, 9))
			System.out.println("Found");
		else
			System.out.println("Not found");

		delete(root, 9);
		inOrder(root);
		System.out.println();
	}

}
