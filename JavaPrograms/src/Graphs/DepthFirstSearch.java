package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearch {

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

		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));

		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));

		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));

		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));

	}

	public static void dfs(ArrayList<Edge> graph[], int curr, boolean visit[]) {

		System.out.println(curr + " ");
		visit[curr] = true;

		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (visit[e.des] == false)
				dfs(graph, e.des, visit);
		}
	}

	public static void main(String[] args) {
		int V = 7;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);

		boolean visit[] = new boolean[V];
		for (int i = 0; i < V; i++) {
			if (visit[i] == false)
				dfs(graph, i, visit);
		}
		//dfs(graph, 0, visit);
		System.out.println();
	}
}
