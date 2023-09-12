package com.challenges.problems;

import java.util.ArrayList;

public class GreatestCommonFactor {
	
	public static void GreatestCommonFactor(Integer num1, Integer num2) {
		try {
			Integer gcf = 1;
			ArrayList <Integer> num1Factors = SingleGreatestCommonFactor(num1);
			ArrayList <Integer> num2Factors = SingleGreatestCommonFactor(num2);
			for (Integer i: num1Factors) {
				if (num2Factors.contains(i)) {
					gcf = i;
				}
			}
			if (gcf == 1){
				System.out.println("No Common Factor.");
			}
			else {
				System.out.println("The Greatest Common Factor of " + num1 + " and " + num2 + " is: " + gcf);
			}
		}
		catch (IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }
	
	}
//		if (num1 == 0 || num2 == 0) {
//			Integer gcf = 1;
//			ArrayList <Integer> num1Factors = SingleGreatestCommonFactor(num1);
//			ArrayList <Integer> num2Factors = SingleGreatestCommonFactor(num2);
//			for (Integer i: num1Factors) {
//				if (num2Factors.contains(i)) {
//					gcf = i;
//				}
//			}
//			if (gcf == 1){
//				System.out.println("No Common Factor.");
//			}
//			else {
//				System.out.println("The Greatest Common Factor of " + num1 + " and " + num2 + " is: " + gcf);
//			}
//			
//		}
//		else {
//			System.out.println("Method cannot be passed '0' as one of its arguments.");
//		}
//				
//	}
	
	
	private static ArrayList <Integer> SingleGreatestCommonFactor(Integer num) {
		ArrayList <Integer> factors = new ArrayList();
		Integer counter = 1;
		Integer half = num / 2;
		
		while (counter <= half) {
			if (num % counter == 0) {
				factors.add(counter);
			}
			counter += 1;
		}
		return factors;
	}
}

//
//def single_greatest_common_factor(num):
//    counter = 1
//    factors = []
//    half = num // 2
//    while counter <= half:
//        if num % counter == 0:
//            factors.append(counter)
//        counter += 1
//    return factors
