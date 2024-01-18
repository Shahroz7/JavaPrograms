package Recursion_DP;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
//main method
	public static void main(String[] args) {

		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
		int size = maze.length;
		List<String> ans = findPath(maze, size);
		System.out.println(ans);
	}

// initial definitions
	private static List<String> findPath(int[][] maze, int n) {
		List<String> ans = new ArrayList<>();
		String path = "";
		int visited[][] = new int[n][n];
		// if starting position is 0 then the move will be invalid by default
		if (maze[0][0] == 0) {
			return ans;
		}
		solveMaze(0, 0, maze, n, ans, visited, path);
		return ans;
	}

	// checking if the maze is valid and safe to proceed
	private static boolean isSafe(int row, int col, int visited[][], int[][] maze, int n) {
		if ((row >= 0 && row < n) && (col >= 0 && col < n) && (visited[row][col] == 0 && maze[row][col] == 1)) {
			return true;
		} else
			return false;
	}

	private static void solveMaze(int x, int y, int[][] maze, int n, List<String> ans, int[][] visited, String path) {

		// base case
		if (x == n - 1 && y == n - 1) {
			ans.add(path);
			return;
		}
		
		visited[x][y] = 1;
		// Down
		if (isSafe(x + 1, y, visited, maze, n)) {
			solveMaze(x + 1, y, maze, n, ans, visited, path + "D");
		}
		// Left
		if (isSafe(x, y - 1, visited, maze, n)) {
			solveMaze(x, y - 1, maze, n, ans, visited, path + "L");
		}
		// Right
		if (isSafe(x, y + 1, visited, maze, n)) {
			solveMaze(x, y + 1, maze, n, ans, visited, path + "R");
		}
		// Up
		if (isSafe(x - 1, y, visited, maze, n)) {
			solveMaze(x - 1, y, maze, n, ans, visited, path + "U");
		}
		visited[x][y] = 0;

	}
}
