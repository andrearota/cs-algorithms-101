package com.andrearota.general;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			System.out.println(evaluate(i));
		}

	}

	private static String evaluate(int number) {

		String result = "";

		if (number % 3 == 0) {
			result = result + "Fizz";
		}

		if (number % 5 == 0) {
			result = result + "Buzz";
		}

		if (result.isEmpty()) {
			result = Integer.toString(number);
		}

		return result;
	}

}
