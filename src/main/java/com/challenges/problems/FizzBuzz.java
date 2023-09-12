package com.challenges.problems;

public class FizzBuzz {

	public static void FizzBuzz() {
		int counter = 1;
		
		while (counter <= 100) {
			if (counter % 3 == 0 && counter % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (counter % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (counter % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(counter);
			}
			counter += 1;

		}
	}
}
   