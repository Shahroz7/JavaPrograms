package Stacks;

public class StackUsingLinkedList {

	public static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static class StackLL {
		Node head = null;
		int size = 0;

		void push(int val) {
			Node temp = new Node(val);
			temp.next = head;
			head = temp;
			size++;
		}

		int pop() {
			if (head == null) {
				System.out.println("Stack is Empty");
				return -1;
			}
			int curr = head.val;
			head = head.next;
			return curr;
		}

		int peek() {
			if (head == null) {
				System.out.println("Stack is Empty");
				return -1;
			}
			return head.val;
		}

		boolean isEmpty() {
			if (size == 0)
				return true;
			return false;
		}

		int size() {
			return size;
		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.val + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		void displayRecursion() {
			displayReverse(head);
			System.out.println();
		}

		void displayReverse(Node head) {
			if (head == null)
				return;
			displayReverse(head.next);
			System.out.println(head.val);
		}

	}

	public static void main(String[] args) {
		StackLL st = new StackLL();
		st.push(5);
		st.display();
		st.push(4);
		st.push(7);
		st.pop();

		st.push(3);
		//st.displayRecursion();
		System.out.println("Peek:" + st.peek());
		
		//st.displayRecursion();
		
		System.out.println("Original List:");
        st.display();

        System.out.println("List in Reverse Order (using recursion):");
        st.displayRecursion();

    	System.out.println("Peek:" + st.peek());
	}

}
