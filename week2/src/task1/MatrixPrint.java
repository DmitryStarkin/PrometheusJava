package task1;

public class MatrixPrint {

	public static void main(String[] args) {
		int sideSize = 5;
		int delta = 1;
		for (int i = 0; i < sideSize; i++) {
			for (int j = 0; j < sideSize; j++) {

				if (j == i || j == (sideSize - 1 - i)) {
					System.out.printf("%2s ", "*");
				} else {
					System.out.printf("%2d ", j + delta);
				}

			}
			delta += sideSize;
			System.out.printf("\n");

		}

	}

}
