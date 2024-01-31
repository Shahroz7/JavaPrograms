package Trie;

public class LongestWordWithAllPrefixes {

	static class Node {
		Node[] children;
		boolean eow;

		public Node() {
			children = new Node[26];
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
			eow = false;
		}
	}

	static Node root = new Node();

	public static void insert(String word) {
		Node temp = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';

			if (temp.children[index] == null)
				temp.children[index] = new Node();

			if (i == word.length() - 1)
				temp.children[index].eow = true;

			temp = temp.children[index];
		}
	}

	public static boolean search(String key) {
		Node temp = root;
		for (int i = 0; i < key.length(); i++) {
			int index = key.charAt(i) - 'a';
			Node node = temp.children[index];

			if (node == null)
				return false;

			if (i == key.length() - 1 && node.eow == false)
				return false;

			temp = temp.children[index];
		}
		return true;
	}

	public static String ans = "";

	public static void longestWord(Node root, StringBuilder temp) {
		if (root == null)
			return;
		for (int i = 0; i < 26; i++) {
			if (root.children[i] != null && root.children[i].eow == true) {
				temp.append((char) (i + 'a'));
				if (temp.length() > ans.length())
					ans = temp.toString();
				longestWord(root.children[i], temp);
				temp.deleteCharAt(temp.length() - 1);

			}
		}
	}

	public static void main(String[] args) {
		String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
		for(int i=0;i<words.length;i++) {
			insert(words[i]);
		}
		longestWord(root, new StringBuilder(""));
		System.out.println(ans);
	}

}
