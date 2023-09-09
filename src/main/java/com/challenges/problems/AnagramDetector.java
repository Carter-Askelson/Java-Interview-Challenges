package com.challenges.problems;

import java.util.HashMap;

import com.challenges.data.DataStructures;
public class AnagramDetector {
	
	public static boolean checkIfAnagram(String string1, String string2) {
		HashMap<String, Integer> newHashMap = DataStructures.createHashMap();
	    String lowerString1 = string1.toLowerCase();
	    String lowerString2 = string2.toLowerCase();

	    if (lowerString1.length() != lowerString2.length()) {
	        return false;
	    }

	    for (int i = 0; i < lowerString1.length(); i++) {
	        newHashMap.put(lowerString1.substring(i, i + 1), i);
	    }
	    for (int i = 0; i < lowerString2.length(); i++) {
	        if (!newHashMap.containsKey(lowerString2.substring(i, i + 1))) {
	        	return false;
	        }
	    }
	    
	    return true;
		
		
		
	}

}