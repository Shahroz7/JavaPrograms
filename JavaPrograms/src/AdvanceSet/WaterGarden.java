package AdvanceSet;

//Magnificent Fountains
//Activation Fountain
public class WaterGarden {

	public static int minGardenTaps(int n, int ranges[]) {
		int max = 0;
		int min = 0;
		int tapsOpen = 0;
		int index = 0;

		while (max < n) {// finding the range

			for (int i = index; i < ranges.length; i++) {

				if (i - ranges[i] <= min && i + ranges[i] > max) {
					max = i + ranges[i];
					index = i;// for making sure the loop is not starting from 0 again
				}
			}
			if (min == max)
				return -1;
			tapsOpen++;
			min = max;
		}
		return tapsOpen;
	}

	public static void main(String[] args) {

		int array[] = { 4, 0, 0, 0, 0, 0, 0, 0, 4 };
		int n = 8;
		System.out.println(minGardenTaps(n, array));
	}

}
