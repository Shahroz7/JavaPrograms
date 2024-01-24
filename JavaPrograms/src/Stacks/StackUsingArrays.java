package Stacks;

public class StackUsingArrays {

	public static class Stack {

		int[] arr = new int[4];
		int index = 0;

		// adding in stack
		void push(int value) {

			if (isFull()) {
				System.out.println("Stack is full");
				return;
			}
			arr[index] = value;
			index++;
		}

		// getting the top element of stack
		int peek() {
			if (index == 0) {
				System.out.println("Stack is empty");
				return -1;
			}
			return arr[index - 1];
		}

		// remove elements from stack
		int pop() {
			if (index == 0) {
				System.out.println("Stack is empty");
				return -1;
			}
			int top = arr[index - 1];
			arr[index - 1] = 0;
			index--;
			return top;
		}

		// get size of the stack
		void size() {
			System.out.println(index);
		}

		// to check if the stack is empty
		boolean isEmpty() {
			if (index == 0)
				return true;
			else
				return false;
		}

		// if Stack is full
		boolean isFull() {
			if (index == arr.length)
				return true;
			else
				return false;
		}

		// to get the capacity of the stack
		int capacity() {
			return arr.length;
		}

		// to display the stack
		void display() {
			for (int i = 0; i <= index - 1; i++) {
				System.out.println(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Stack st = new Stack();
		st.push(5);
		st.push(4);
		st.push(9);
		st.pop();
		st.push(7);
		st.display();
		st.size();
		st.push(3);
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		st.push(8);
	}

}
