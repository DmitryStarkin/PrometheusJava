package com.tasks7.rpn;

public class test {

	public static void main(String[] args) {
		String[] testArgs;
		String testExpression;
		String rightAnswer;
		try {
			System.out.println("Test case: args == null");
			System.out.println("Right answer: RPNParserException");
			Application.main(null);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			System.out.println("Test case: args.length == 0");
			System.out.println("Right answer: RPNParserException");
			testArgs = new String[] {};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			System.out.println("Test case: args[0] == null");
			System.out.println("Right answer: RPNParserException");
			testArgs = new String[] {null};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			testExpression = "10 20 + 30 40 + *";
			rightAnswer = "2100";
			System.out.println("Test case: " + testExpression);
			System.out.println("Right answer: " + rightAnswer);
			testArgs = new String[] {testExpression};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			testExpression = "10 20 30.0 * +";
			rightAnswer = "610";
			System.out.println("Test case: " + testExpression);
			System.out.println("Right answer: " + rightAnswer);
			testArgs = new String[] {testExpression};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			testExpression = "10 20 30 () +";
			rightAnswer = "RPNParserException";
			System.out.println("Test case: " + testExpression);
			System.out.println("Right answer: " + rightAnswer);
			testArgs = new String[] {testExpression};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			testExpression = "10 20 Е * +";
			rightAnswer = "RPNParserException";
			System.out.println("Test case: " + testExpression);
			System.out.println("Right answer: " + rightAnswer);
			testArgs = new String[] {testExpression};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			testExpression = "0 0 /";
			rightAnswer = "ArithmeticException";
			System.out.println("Test case: " + testExpression);
			System.out.println("Right answer: " + rightAnswer);
			testArgs = new String[] {testExpression};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			testExpression = "10 + 30 * 40";
			rightAnswer = "RPNParserException";
			System.out.println("Test case: " + testExpression);
			System.out.println("Right answer: " + rightAnswer);
			testArgs = new String[] {testExpression};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			testExpression = "10 20 + 30 40 + ";
			rightAnswer = "RPNParserException";
			System.out.println("Test case: " + testExpression);
			System.out.println("Right answer: " + rightAnswer);
			testArgs = new String[] {testExpression};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
		try {
			testExpression = "20 / 10 ";
			rightAnswer = "10";
			System.out.println("Test case: " + testExpression);
			System.out.println("Right answer: " + rightAnswer);
			testArgs = new String[] {testExpression};
			Application.main(testArgs);
		} catch (Exception e) {
			System.out.println("Вылетело исключение: " + e);
		}
	}

}
