package Graphs;

import java.util.ArrayList;

public class CycleDirectedGraph {

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

		graph[0].add(new Edge(0, 2));
		graph[1].add(new Edge(1, 0));
		graph[2].add(new Edge(2, 3));
		graph[3].add(new Edge(3, 0));
	}

	public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean visit[], int curr, boolean rec[]) {
		visit[curr] = true;
		rec[curr] = true;

		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (rec[e.des]) {
				return true;
			} else if (!visit[e.des]) {
				if (isCycleDirected(graph, visit, e.des, rec))
					return true;
			}
		}
		rec[curr] = false;
		return false;
	}

	public static void main(String[] args) {
		int V = 4;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);

		// System.out.println(isCycleDirected(graph, new boolean[V], 0, new boolean[V]));

		boolean visit[] = new boolean[V];
		boolean rec[] = new boolean[V];
		for (int i = 0; i < V; i++) {
			if (!visit[i]) {
				boolean isCycle = isCycleDirected(graph, visit, 0, rec);
				if (isCycle) {
					System.out.println(isCycle);
					break;
				}
			}
		}
	}
}