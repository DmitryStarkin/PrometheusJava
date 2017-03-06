package task1;

public class SquareRoot {

	public static void main(String[] args) {
		double a = 1;
		double b = 1.1;
		double c = 0.1;

		double d = b * b - 4 * a * c;
		if (a == 0) {
			if (c == 0 & b != 0) {
				System.out.printf("x1=0.0\n");
				System.out.printf("x2=0.0\n");
				return;
			} else if (b != 0) {
				System.out.printf("x1=.1%f\n", (-c) / b);
				System.out.printf("x2=%.1f\n", (-c) / b);
				return;
			}
			d = -1;
		}
		if (d > 0) {
			System.out.printf("x1=%.1f\n", (-b + Math.sqrt(d)) / (a * 2));
			System.out.printf("x2=%.1f\n", (-b - Math.sqrt(d)) / (a * 2));
			return;
		} else if (Math.rint(d) == 0) {
			System.out.printf("x1=%.1f\n", -(b / (a * 2)));
			System.out.printf("x2=%.1f\n", -(b / (a * 2)));
			return;
		}

		System.out.println("x1=");
		System.out.println("x2=");
	}

}
