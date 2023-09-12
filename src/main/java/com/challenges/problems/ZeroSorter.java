package com.challenges.problems;

import java.util.ArrayList;

import com.challenges.data.DataStructures;

public class ZeroSorter {
	
//	How to run to check time difference
//	
//	long startTimeSlow = System.currentTimeMillis();
//    String slowSorted = ZeroSorter.SlowZeroSorter(new ArrayList<>(DataStructures.createList(0, 1, 2, 3, 5, 0, 0, 0, 5, 4, 4, 698, 1, 6, 5, 0, 0, 0, 60, 1, 0, 0, 1, 2, 3,0, 1, 2, 3, 5, 0, 0, 0, 5, 4, 4, 698, 1, 6, 5, 0, 0, 0, 60, 1, 0, 0, 1, 2, 3,0, 1, 2, 3, 5, 0, 0, 0, 5, 4, 4, 698, 1, 6, 5, 0, 0, 0, 60, 1, 0, 0, 1, 2, 3))); // Create a copy to preserve the original list
//    long endTimeSlow = System.currentTimeMillis();
//    long executionTimeSlow = endTimeSlow - startTimeSlow;
//
//    System.out.println("SlowZeroSorter Result: " + slowSorted);
//    System.out.println("SlowZeroSorter Execution Time: " + executionTimeSlow + " milliseconds");
//
//    // Measure and print the execution time of FastZeroSorter
//    long startTimeFast = System.currentTimeMillis();
//    String fastSorted = ZeroSorter.FastZeroSorter(new ArrayList<>(DataStructures.createList(0, 1, 2, 3, 5, 0, 0, 0, 5, 4, 4, 698, 1, 6, 5, 0, 0, 0, 60, 1, 0, 0, 1, 2, 3,0, 1, 2, 3, 5, 0, 0, 0, 5, 4, 4, 698, 1, 6, 5, 0, 0, 0, 60, 1, 0, 0, 1, 2, 3,0, 1, 2, 3, 5, 0, 0, 0, 5, 4, 4, 698, 1, 6, 5, 0, 0, 0, 60, 1, 0, 0, 1, 2, 3))); // Create a copy to preserve the original list
//    long endTimeFast = System.currentTimeMillis();
//    long executionTimeFast = endTimeFast - startTimeFast;
//
//    System.out.println("FastZeroSorter Result: " + fastSorted);
//    System.out.println("FastZeroSorter Execution Time: " + executionTimeFast + " milliseconds");

	public static String SlowZeroSorter(ArrayList<Integer> numberList) {
		Boolean change = true;
		
		while (change) {
			change = false;
			int counter = 0;
			
			while (counter < numberList.size() - 1) {
				if (numberList.get(counter) == 0 && numberList.get(counter + 1) != 0) {
					Integer newVal = numberList.get(counter + 1);
					numberList.set(counter + 1, numberList.get(counter));
					numberList.set(counter, newVal);
					change = true;
				}
				counter += 1;
			}
		}
		return numberList.toString();
	}
	
	public static String FastZeroSorter(ArrayList<Integer> numberList) {
		int zeroCount = 0;
		int currentLen = numberList.size();
		int counter = 0;
		while (counter < currentLen) {
			if (numberList.get(counter) == 0) {
				zeroCount += 1;
				numberList.remove(counter);
				currentLen -= 1;
				counter -= 1;
			}
			counter += 1;
		}
		while (zeroCount != 0) {
			numberList.add(0);
			zeroCount -= 1;
		}
		return numberList.toString();
	}
	
}
