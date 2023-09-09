package com.challenges.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

import com.challenges.data.DataStructures;

public class AnagramGenerator {
	
	public static void AnagramGenerator(Object word) {
		
		Hashtable<String, String> newHashMap = new Hashtable<String, String>();
		String newWord = word.toString().toLowerCase();
		int currentLoop = 1;
		ArrayList<String> keyList = new ArrayList<String>();
		ArrayList<String> valueList = new ArrayList<String>();
		int wordLength = newWord.length();
		int valuePosition = 0;
		Integer wordLengthCounter = 0;
		//set up to get proper positions of values to iterate over
		
		ArrayList<String> currentTakenPositions = new ArrayList<String>();
		while (wordLengthCounter < wordLength) {
			currentTakenPositions.add(wordLengthCounter.toString());
			wordLengthCounter += 1;
		}
		
		
		//first round to get values
		Integer positionCounter = 0;
		
		for (int i = 0; i < newWord.length(); i++) {
			newHashMap.put(currentTakenPositions.get(positionCounter), newWord.substring(i, i + 1));
			positionCounter += 1;
		}
		
		
		//adds every single unique anagram to a hashtable
		while (currentLoop != wordLength || wordLength == 0) {
			keyList.clear();
			valueList.clear();
			Enumeration<String> enuKeys = newHashMap.keys();
			
			while (enuKeys.hasMoreElements()) {
				keyList.add(enuKeys.nextElement());
		    }
			
			Iterator<String> iterator = keyList.iterator();
		    while (iterator.hasNext()) {
		    	String element = iterator.next();
		           
		        if (element.length() != currentLoop) {
		        	iterator.remove(); // Remove elements with the specified length
		        }
		    }
		    
			Collections.sort(keyList);

			for (String i: keyList) {
				if (i.length() == currentLoop) {
					
					valueList.add(newHashMap.get(i));
				}
				
			}
			
			currentLoop += 1;
			valuePosition = 0;
			
			//goes through the loop to add additional values to the string and checks to see if that combination is in the hashtable or not
			for (String i : keyList) {
				positionCounter = 0;
				String currentValue = valueList.get(valuePosition);
				for (int j = 0; j < newWord.length(); j++) {
					
					if (i.contains(positionCounter.toString()) == false) {
						
						String newKey = i + positionCounter.toString();
						
						if (newHashMap.containsKey(newKey) == false) {
							
							String newValue = currentValue + newWord.substring(j, j + 1);
						
							newHashMap.put(newKey, newValue);
						}
					}
				positionCounter += 1;
				}		
			valuePosition += 1;	
			}			
		}
		
		//prints every single unique anagram to the console
		System.out.println("All Anagrams possible of: " + word);
			
		Enumeration<String> enuKeysFinal = newHashMap.keys();
			
		while (enuKeysFinal.hasMoreElements()) {
				
			keyList.add(enuKeysFinal.nextElement());
		}
		Collections.sort(keyList);
		for (String j: keyList) {
			if (j.length() == wordLength) {
				System.out.println(newHashMap.get(j));
			}
		}
			
	}	
	
}

