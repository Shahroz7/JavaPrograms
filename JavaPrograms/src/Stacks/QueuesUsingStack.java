package Stacks;

import java.util.Iterator;
import java.util.Stack;

public class QueuesUsingStack {
	Stack<Integer> st = new Stack<>();
	Stack<Integer> helper = new Stack<>();

	public QueuesUsingStack() {
	}

	public void push(int val) {
		st.push(val);
	}

	public int pop() {
		while (!st.isEmpty()) {
			helper.push(st.pop());
		}
		int val = helper.pop();
		while (!helper.isEmpty()) {
			st.push(helper.pop());
		}
		return val;
	}

	public int peek() {
		while (!st.isEmpty()) {
			helper.push(st.pop());
		}
		int val = helper.peek();
		while (!helper.isEmpty()) {
			st.push(helper.pop());
		}
		return val;
	}

	public boolean empty() {
		return st.isEmpty();
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
		queue.push(7);
		
		//queue.pop();
		System.out.println("Is the queue empty now? " + queue.empty()); // should print true
		queue.display();
	}
}