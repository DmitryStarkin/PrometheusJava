package task1;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = { 23, 7, 10, 34, 1, 75, 4 };
		int length = array.length;

		boolean flag;
		int tmp = 0;

		do {
			flag = false;
			for (int i = 0, j = 1; j < length; i++, j++) {
				if (array[i] > array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					flag = true;
				}
			}
		} while (flag);

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");

		}

	}
}