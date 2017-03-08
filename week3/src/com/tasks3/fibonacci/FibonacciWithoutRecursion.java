package com.tasks3.fibonacci;

public class FibonacciWithoutRecursion {

	public long getNumber(int position) {
		long[] prewNumber = { 0, 1 };
		long curentNumber = 1;
		int counter = 2;
		if (position < 3) {
			if (position <= 0) {
				return -1;
			}
			return 1;
		}
		while (counter <= position) {
			curentNumber = prewNumber[0] + prewNumber[1];
			prewNumber[0] = prewNumber[1];
			prewNumber[1] = curentNumber;
			counter++;
		}
		return curentNumber;
	}
}
