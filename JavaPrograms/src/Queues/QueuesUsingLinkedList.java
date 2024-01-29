package Queues;

public class QueuesUsingLinkedList {

	public static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static class Queues {
		Node head = null;
		Node tail = null;
		int size = 0;

		public void add(int val) {
			Node temp = new Node(val);
			if (size == 0) {
				head = tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}

		public int remove() {
			if (size == 0) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int val = head.val;
			head = head.next;
			size--;
			return val;
		}

		public int peek() {
			if (size == 0) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return head.val;
		}

		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		public boolean isEmpty() {
			if (size == 0) {
				return true;
			} else
				return false;
		}

	}

	public static void main(String[] args) {

		Queues q = new Queues();
		q.add(4);
		q.display();
		System.out.println("size of queue" + q.size);
		q.add(6);
		q.remove();
		q.add(9);
		System.out.println("-----");
		q.display();
		q.add(3);
		q.remove();
		System.out.println("-----");
		q.display();
		System.out.println("peek");
		System.out.println(q.peek());
	}

}
