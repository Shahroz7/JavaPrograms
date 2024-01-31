package Trie;

public class WordBreak {

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

	public static boolean wordBreak(String key) {
		if (key.length() == 0) {
			return true;
		}

		for (int i = 1; i <= key.length(); i++) {
			String firstPart = key.substring(0, i);
			String secPart = key.substring(i);
			if (search(firstPart) && wordBreak(secPart)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String words[] = { "i", "like", "sam", "samsung", "mobile" };
		String key = "ilikesamsung";

		for (int i = 0; i < words.length; i++) {
			insert(words[i]);
		}
		System.out.println(wordBreak(key));
	}

}
