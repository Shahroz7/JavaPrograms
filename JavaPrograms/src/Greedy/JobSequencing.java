package Greedy;

import java.util.Arrays;

class Job {
	int id, profit, deadline;

	Job(int x, int y, int z) {
		this.id = x;
		this.deadline = y;
		this.profit = z;
	}
}

public class JobSequencing {
	// return an array of size 2 having the 0th element equal to the count
	// and 1st element equal to the maximum profit
	int[] JobScheduling(Job arr[], int n) {
		Arrays.sort(arr, (a, b) -> (b.profit - a.profit)); // Sort jobs by profit (descending order)

		int maxDeadline = 0;
		for (int i = 0; i < n; i++) {
			maxDeadline = Math.max(maxDeadline, arr[i].deadline); // Find the maximum deadline
		}

		int result[] = new int[maxDeadline + 1]; // Array to store the assigned jobs

		Arrays.fill(result, -1); // Initialize slots as empty

		int countJobs = 0, jobProfit = 0;

		for (int i = 0; i < n; i++) {
			for (int j = arr[i].deadline; j > 0; j--) {
				// Free slot found
				if (result[j] == -1) {
					result[j] = i; // Assign job to the slot
					countJobs++;
					jobProfit += arr[i].profit;
					break;
				}
			}
		}

		// Find the jobs scheduled and calculate profit
		int[] scheduledJobs = new int[countJobs];
		int idx = 0;
		for (int i = 1; i <= maxDeadline; i++) {
			if (result[i] != -1) {
				scheduledJobs[idx++] = result[i];
			}
		}

		int ans[] = new int[2];
		ans[0] = countJobs;
		ans[1] = jobProfit;
		ans = Arrays.copyOf(ans, countJobs + 2);
		System.arraycopy(scheduledJobs, 0, ans, 2, countJobs);
		return ans;
	}

	public static void main(String[] args) {

		// size of array
		Job[] arr = new Job[4];
		arr[0] = new Job(1, 4, 20);
		arr[1] = new Job(2, 1, 10);
		arr[2] = new Job(3, 2, 40);
		arr[3] = new Job(4, 2, 30);

		JobSequencing ob = new JobSequencing();

		// function call
		int[] res = ob.JobScheduling(arr, 4);

		// Print job sequence
		System.out.println("Number of jobs scheduled: " + res[0]);
		System.out.println("Total profit: " + res[1]);
		System.out.println("Job sequence:");
		for (int i = 2; i < res.length; i++) {
			System.out.print(arr[res[i]].id + " ");
		}
	}
}
