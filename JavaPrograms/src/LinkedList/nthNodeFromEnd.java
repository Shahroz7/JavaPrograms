package LinkedList;

public class nthNodeFromEnd {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node nthNode2(Node head, int n) {

		Node fast = head;
		Node slow = head;
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static void deleteNthFromEnd(Node head, int n) {
		Node slow = head;
		Node fast = head;
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}
		if (fast == null) {
			head = head.next;
			return;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		//if return type is Node return head;
	}

	public static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	// one way
//	public static Node nthNode(Node head, int n) {
//		int size = 0;
//		Node temp = head;
//		while (temp != null) {
//			size++;
//			temp = temp.next;
//		}
//		// mth node from the start
//		int m = size - n + 1;
//		temp = head;
//		for (int i = 1; i <= m - 1; i++) {
//			temp = temp.next;
//		}
//		return temp;
//	}

	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(1);
		Node e = new Node(2);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		// Node temp = nthNode2(a, 3);
		// System.out.println(temp.data);

		deleteNthFromEnd(a, 3);
		display(a);

	}

}
