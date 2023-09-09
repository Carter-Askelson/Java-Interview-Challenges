package com.challenges.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import com.challenges.data.DataStructures;

public class DuplicateListFinder {

	public static String DuplicateListFinder(ArrayList list) {
		//test
		//ArrayList <Integer> newlist = DataStructures.createList(1,1,2,2,2,2,2,2,3,3,3,3,3,4);
		//System.out.println(DuplicateListFinder.DuplicateListFinder(newlist));
		
		
		
		Integer duplicateCounter = 0;
		HashMap newHashTable = new HashMap<>();
		for (Object i: list) {
			if (newHashTable.containsKey(i)) {
				duplicateCounter += 1;
			}
			else{
				newHashTable.put(i,i);
			}
		}
		return "There are " + duplicateCounter.toString() + " duplicates in this list.";
	}
	
	
}

