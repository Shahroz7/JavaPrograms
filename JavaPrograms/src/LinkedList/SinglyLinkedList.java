package LinkedList;

public class SinglyLinkedList {

	// Node of a LinkedList
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static boolean isEmpty(Node head) {
		return head == null;
	}

	public static int size(Node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	// Displaying a LinkedList
	public static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	// Displaying a LinkedList using recursion
	public static void displayRecursion(Node head) {
		System.out.println("Displaying using recursion");

		if (head == null)
			return;
		System.out.println(head.data);
		displayRecursion(head.next);
	}

	// Displaying a reverse LinkedList using recursion
	public static void displayReverse(Node head) {
		System.out.println("Displaying reverse linkledlist");

		if (head == null)
			return;
		displayReverse(head.next);
		System.out.println(head.data);
	}

	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(4);
		Node c = new Node(2);
		Node d = new Node(7);
		a.next = b;
		b.next = c;
		c.next = d;

		// display(a);
		System.out.println(isEmpty(a));
		System.out.println(size(a));

//		displayRecursion(a);
//		displayReverse(a);

	}
}
