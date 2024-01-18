package LinkedList;

public class SinglyLinkedListImpl {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static class linkedlist {
		Node head = null;
		Node tail = null;
		int size;

		
		// inserting at the start
		void insertAtStart(int data) {
			Node temp = new Node(data);
			if (head == null)
				head = tail = temp;
			else {
				temp.next = head;
				head = temp;
			}
			size++;
		}
		

		// inserting at the end
		void insertAtEnd(int data) {
			Node temp = new Node(data);
			if (head == null)
				head = temp;
			else
				tail.next = temp;
			tail = temp;
			size++;
		}

		
		// inserting at any position
		void insertAtAnyPosition(int position, int data) {
			Node temp = new Node(data);
			Node current = head;

			if (position == size) {
				insertAtEnd(data);
				return;

			} else if (position == 0) {
				insertAtStart(data);
				return;

			} else if (position < 0 || position > size) {
				System.out.println("wrong position");
				return;
			}

			for (int i = 1; i <= position - 1; i++) {
				current = current.next;
			}
			temp.next = current.next;
			current.next = temp;
			size++;
		}

		
		// get value from any position in a linked list
		int getAnyPosition(int position) {
			Node temp = head;

			if (position < 0 || position > size) {
				System.out.println("wrong position");
				return -1;
			}
			for (int i = 1; i <= position; i++) {
				temp = temp.next;
			}
			return temp.data;
		}

		
		// delete a linked list in any position
		void deleteAtAnyPosition(int position) {
			if (position == 0) {
				head = head.next;
				size--;
				return;
			}
			Node temp = head;
			for (int i = 1; i <= position - 1; i++) {
				temp = temp.next;
			}
			if (temp.next == tail) {
				tail = temp;
			}
			temp.next = temp.next.next;
			size--;
		}
		
		
		//Middle of a linked list
		public void middleNode() {
	        Node fast = head;
	        Node slow = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        System.out.println(slow.data);
	    }

		// Displaying a LinkedList
		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}

		// to find the length of the linkedlist
//		int size() {
//			Node temp = head;
//			int count = 0;
//			while (temp != null) {
//				count++;
//				temp = temp.next;
//			}
//			return count;
//		}

	}

	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		ll.insertAtEnd(6);
		ll.insertAtEnd(8);
		ll.insertAtEnd(4);
		// ll.display();
		ll.insertAtStart(3);
		ll.insertAtStart(2);
		// ll.display();
		ll.insertAtEnd(9);
		ll.insertAtStart(0);
		// ll.display();
		ll.insertAtAnyPosition(0, 1);
		ll.insertAtAnyPosition(8, 10);
		ll.insertAtAnyPosition(3, 15);
		ll.insertAtAnyPosition(6, 27);
		ll.insertAtStart(17);

		ll.deleteAtAnyPosition(7);
//		System.out.println("size after delete");
		ll.insertAtEnd(65);
//		System.out.println(ll.size);
		System.out.println("-------");
		ll.display();
		System.out.println("-------");
		//System.out.println(ll.tail.data);
		System.out.println("---middle node---");
		ll.middleNode();

	}

}
