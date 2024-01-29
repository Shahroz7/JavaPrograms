package Queues;

public class QueueUsingArrays {

	public static class Queues {
		int front = -1;
		int rear = -1;
		int size = 0;
		int arr[] = new int[10];

		public void add(int val) {
			if (rear == arr.length - 1) {
				System.out.println("Queue is full");
				return;
			}
			if (front == -1) {
				front = rear = 0;
				arr[0] = val;
			} else {
				arr[++rear] = val;
			}
			size++;
		}

		public int remove() {
			if (size == 0) {
				System.out.println("Queue is empty ");
				return -1;
			}
			int val = arr[front];
			front++;
			size--;
			return val;
		}

		public int peek() {
			if (size == 0) {
				System.out.println("Queue is empty ");
				return -1;
			}
			return arr[front];
		}

		public boolean isEmpty() {
			if (size == 0)
				return true;
			else
				return false;
		}

		public void display() {
			if (size == 0) {
				System.out.println("Queue is empty");
			} else {
				for (int i = front; i <= rear; i++) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Queues q = new Queues();
		q.display();
		q.add(1);
		q.add(4);
		q.add(5);
		q.add(9);
		q.add(6);
		q.display();
		q.remove();
		q.add(2);
		System.out.println("---");
		q.display();
		System.out.println(q.peek());
		System.out.println("Size of queue "+q.size);
	}

}
