package task1;

public class BinarySearch {

	public static void main(String[] args) {

		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;

		int len = data.length;
		int key = len / 2;
		do {
			len /= 2;
			if (data[key] == numberToFind) {
				System.out.println(key);
				return;
			}
			if (data[key] > numberToFind) {
				key = key - len / 2 - 1;
			} else {
				key = key + (len + 1) / 2;
			}
		} while (len != 0);
		System.out.println("-1");
	}
}
