package task1;

public class ShellSort {

	public static void main(String[] args) {
		int[] array = { 30, 2, 10, 4, 6 };
		int length = array.length;
		int step = 1;
		int tmp;
		while (step < length / 3) {
			step = step * 3 + 1;
		}
		while (step >= 1) {
			for (int i = step; i < length; i++) {

				for (int j = i; (j >= step) && (array[j] < array[j - step]); j -= step) {
					tmp = array[j];
					array[j] = array[j - step];
					array[j - step] = tmp;
				}
			}
			step /= 3;

		}

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");

		}

	}
}
