package Recursion_DP;

public class TowerOfHanoi {

	public static void main(String[] args) {

		int numberOfDisc = 3;
		tower(numberOfDisc, 'A', 'B', 'C');

	}

	private static void tower(int numberOfDisc, char source, char aux, char dest) {

		// base condition
		if (numberOfDisc == 1) {
			System.out.println(source + " --> " + dest);
			return;
		}

		// recursion
		tower(numberOfDisc - 1, source, dest, aux);
		tower(1, source, aux, dest);
		tower(numberOfDisc - 1, aux, source, dest);

	}

}
