package Arrays;

//TC O(n)
//SC 0(1)
public class ZeroAndOne {

	public static void main(String[] args) {

		int arrayone[] = { 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1 };
		int length = arrayone.length;
		int left = 0;
		int right = length - 1;

		while (left < right) {
			while (arrayone[left] == 0 && left < right) {
				left++;
			}
			while (arrayone[right] == 1 && left < right) {
				right--;
			}

			if (left < right) {
				int temp = arrayone[left];
				arrayone[left] = arrayone[right];
				arrayone[right] = temp;
				left++;
				right--;
			}
		}

		for (int i = 0; i < length; i++)
			System.out.println(arrayone[i]);

	}

}
