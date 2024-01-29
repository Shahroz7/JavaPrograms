package Stacks;

import java.util.Iterator;
import java.util.Stack;

public class QueuesUsingStackPopEfficient {

	Stack<Integer> st = new Stack<>();
	Stack<Integer> helper = new Stack<>();

	public QueuesUsingStackPopEfficient() {
	}

	public void push(int val) {
		if (st.size() == 0)
			st.push(val);
		else {
			while (st.size() > 0) {
				helper.push(st.pop());
			}
			st.push(val);
			while (helper.size() > 0) {
				st.push(helper.pop());
			}
		}
	}

	public int pop() {
		return st.pop();
	}

	public int peek() {
		return st.peek();
	}

	public boolean empty() {
		if (st.size() == 0)
			return true;
		else
			return false;

	}

	public void display() {
		Iterator<Integer> iterator = st.iterator();
	    System.out.print("Stack: ");
	    while (iterator.hasNext()) {
	        System.out.print(iterator.next() + " ");
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		QueuesUsingStack queue = new QueuesUsingStack();

		queue.push(1);
		queue.push(2);
		queue.push(3);

		queue.display(); // Display the queue

		System.out.println("Front element: " + queue.peek()); // should print 1
		System.out.println("Popped element: " + queue.pop()); // should print 1

		queue.display(); // Display the queue after pop

		System.out.println("Is the queue empty? " + queue.empty()); // should print false

		queue.pop();
		queue.pop();

		queue.push(5);
		queue.push(9);

		System.out.println("Is the queue empty now? " + queue.empty()); // should print true
		queue.display();
	}

}
