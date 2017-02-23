package task1;

public class BinarySearch {

	public static void main(String[] args) {

		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;

		int i = 0;

		while (i < data.length && numberToFind >= data[i]) {
			if (numberToFind == data[i]) {
				System.out.println(i);
				return;
			}
			i++;
		}
		System.out.println("-1");
	}

}
