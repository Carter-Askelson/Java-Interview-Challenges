package com.challenges.problems;

import java.util.ArrayList;

public class PalindromeDetector {
	
	
	public static Boolean checkIfPalindrome(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		//ArrayList<String> backwardsList = new ArrayList<String>();
		String backwardsList = new String();
		
		for (int i = 0; i < word2.length(); i++) {
			backwardsList = word2.substring(i, i + 1) + backwardsList;
		}
		if (word1.equals(backwardsList.toString())) {
			return true;
		}
		else {
			return false;
		}
		
	}
}


//def palindrome_detector(word1, word2):
//    word1 = word1.lower()
//    word2 = word2.lower()
//    if word1 == word2[::-1]:
//        return True
//    else:
//        return False