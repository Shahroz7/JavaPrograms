package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StacksUsingQueuesPopEfficient {

	static class MyStack {
		Queue<Integer> q = new LinkedList<>();

		public MyStack() {
		}

		public void push(int val) {
			if (q.size() == 0)
				q.add(val);
			else {
				q.add(val);
				for (int i = 1; i <= q.size() - 1; i++) {
					q.add(q.remove());
				}
			}
		}

		public int pop() {
			return q.remove();
		}

		public int top() {
			return q.peek();
		}

		public boolean empty() {
			return q.isEmpty();
		}

		public void display() {
			System.out.print("Stack: ");
			while (!q.isEmpty()) {
				System.out.print(q.remove() + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Top element: " + stack.top()); // should print 3
		System.out.println("Popped element: " + stack.pop()); // should print 3
		System.out.println("Top element after pop: " + stack.top()); // should print 2

		System.out.println("Is the stack empty? " + stack.empty()); // should print false

		stack.pop();
		stack.pop();
		stack.push(5);

		System.out.println("Is the stack empty now? " + stack.empty()); // should print true
		stack.display();
	}

}
