package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

	static class Edge {
		int src;
		int des;

		public Edge(int src, int des) {
			this.src = src;
			this.des = des;
		}
	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 1));

		graph[4].add(new Edge(4, 0));
		graph[4].add(new Edge(4, 1));

		graph[5].add(new Edge(5, 0));
		graph[5].add(new Edge(5, 2));
	}

	public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean visit[], Stack<Integer> stack) {

		visit[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);

			if (!visit[e.des]) {
				topSortUtil(graph, e.des, visit, stack);
			}
		}
		stack.push(curr);
	}

	public static void topSort(ArrayList<Edge> graph[], int V) {
		boolean visit[] = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < V; i++) {
			if (!visit[i]) {
				topSortUtil(graph, i, visit, stack);
			}
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}
	}

	public static void main(String[] args) {
		int V = 6;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		topSort(graph, V);

	}

}
