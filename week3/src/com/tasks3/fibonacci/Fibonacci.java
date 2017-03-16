package com.tasks3.fibonacci;

public class Fibonacci {

	public long getNumber(int position) {

		if (position < 3) {
			if (position <= 0) {
				return -1;
			}
			return 1;
		}
		return getNumber(position - 1) + getNumber(position - 2);
	}
}
