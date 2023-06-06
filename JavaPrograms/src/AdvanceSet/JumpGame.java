package AdvanceSet;

public class JumpGame {

	public static boolean canJump(int arr[]) {
		int reach = 0;

		for (int i = 0; i <= reach; i++) {
			reach = Math.max(reach, i + arr[i]);
			if (reach >= arr.length)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 1, 4 };
		System.out.println(canJump(arr));

	}
}
