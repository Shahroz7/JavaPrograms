package Graphs;

import java.util.*;

public class KruskalAlgo {

	static class Edge implements Comparable<Edge> {
		int src;
		int des;
		int wt;

		public Edge(int src, int des, int wt) {
			this.src = src;
			this.des = des;
			this.wt = wt;
		}

		public int compareTo(Edge compareEdge) {
			return this.wt - compareEdge.wt;
		}
	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		graph[0].add(new Edge(0, 2, 2));

		graph[1].add(new Edge(1, 2, 10));
		graph[1].add(new Edge(1, 3, 0));

		graph[2].add(new Edge(2, 0, 2));
		graph[2].add(new Edge(2, 1, 10));
		graph[2].add(new Edge(2, 3, -1));

		graph[3].add(new Edge(3, 1, 0));
		graph[3].add(new Edge(3, 2, -1));
	}

	public static void kruskalMST(ArrayList<Edge>[] graph, int V) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		for (ArrayList<Edge> edges : graph) {
			pq.addAll(edges);
		}

		UnionFind uf = new UnionFind(V);

		ArrayList<Edge> result = new ArrayList<>();
		while (!pq.isEmpty()) {
			Edge edge = pq.poll();
			if (uf.find(edge.src) != uf.find(edge.des)) {
				result.add(edge);
				uf.union(edge.src, edge.des);
			}
		}

		System.out.println("Edges in the minimum spanning tree:");
		for (Edge edge : result) {
			System.out.println(edge.src + " - " + edge.des + " : " + edge.wt);
		}
	}

	public static void main(String[] args) {
		int V = 4;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		kruskalMST(graph, V);
	}
}

class UnionFind {
	int[] parent;

	public UnionFind(int n) {
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
	}

	public int find(int x) {
		if (parent[x] != x) {
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}

	public void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		if (rootX != rootY) {
			parent[rootY] = rootX;
		}
	}
}
