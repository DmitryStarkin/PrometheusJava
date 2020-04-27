package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class Application {

	private final static String DELIM = " ";

	public static double parse(String rpnString) {
		if (rpnString == null || rpnString.isEmpty()) {
			throw new RPNParserException();
		}
		Deque<Double> stack = new LinkedList<Double>();
		String[] result = rpnString.split(DELIM);
		for (int i = 0; i < result.length; i++) {
			if (isNumber(result[i])) {
				stack.push(new Double(result[i]));
			} else if (isOperator(result[i])) {
				if (stack.size() < 2) {
					throw new RPNParserException();
				}
				switch (result[i]) {
				case "+":
					stack.push(new Double(stack.pop() + stack.pop()));
					break;
				case "-":
					stack.push(new Double(-stack.pop() + stack.pop()));
					break;
				case "/":
					if(stack.peek() == 0){
						throw new ArithmeticException();
					}
						stack.push(new Double(1/stack.pop() * stack.pop()));
					break;
				case "*":
					stack.push(new Double(stack.pop() * stack.pop()));
					break;
				}
			} else {
				throw new RPNParserException();
			}
		}
		if (stack.size() != 1) {
			throw new RPNParserException();
		}
		return stack.pop();
	}

	private static boolean isNumber(String string) {
		if (string == null)
			return false;
		return string.matches("^-?\\d+(\\.\\d+)?$");
	}

	private static boolean isOperator(String string) {
		if (string == null)
			return false;
		return string.matches("[+-/*]{1}");
	}

	public static void main(String[] args) {
		
		if (args == null || args.length == 0) {
			throw new RPNParserException();
		}
		System.out.println(parse(args[0]));
	}
}