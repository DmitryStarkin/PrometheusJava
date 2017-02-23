package task1;

public class MatrixPrint {

	public static void main(String[] args) {
		int delta = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (j == i || j == (4 - i)) {
					System.out.printf("%2s ", "*");
				} else {
					System.out.printf("%2d ", j + delta);
				}

			}
			delta += 5;
			System.out.printf("\n");

		}

	}

}
