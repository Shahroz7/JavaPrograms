package Graphs;

import java.util.ArrayList;

public class FloydWarshall {

	static class Edge {
		int src;
		int des;

		public Edge(int src, int des) {
			this.src = src;
			this.des = des;
		}
	}

	static final int INF = 99999; // Infinity value

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 2));
		graph[1].add(new Edge(1, 3));

		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 2));
	}

	public static void floydWarshall(ArrayList<Edge>[] graph, int V) {
		int dist[][] = new int[V][V];

		// Initialize distances with INF
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				if (i == j)
					dist[i][j] = 0;
				else
					dist[i][j] = INF;
			}
		}

		// Update distances based on edges in the graph
		for (int u = 0; u < V; u++) {
			for (Edge e : graph[u]) {
				int v = e.des;
				int weight = 1; // Assuming unit weight for edges
				dist[u][v] = weight;
			}
		}

		// Floyd-Warshall Algorithm
		for (int k = 0; k < V; k++) {
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}

		// Print the shortest distance matrix
		printSolution(dist, V);
	}

	static void printSolution(int dist[][], int V) {
		System.out.println("Shortest distances between every pair of vertices:");
		for (int i = 0; i < V; ++i) {
			for (int j = 0; j < V; ++j) {
				if (dist[i][j] == INF)
					System.out.print("INF ");
				else
					System.out.print(dist[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int V = 4;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		floydWarshall(graph, V);
	}
}