package com.challenges.problems;

import java.util.ArrayList;
import java.util.Random;

public class CaesarCipher {
	
	public static String CaesarCipherEncrypt(String uncodedMessage, Integer incrementAmount) {
		String encodedMessage = "";
				
		for (int i = 0; i < uncodedMessage.length(); i++) {
			Boolean isUpper = false;
			char newChar = uncodedMessage.charAt(i);
			if (Character.isLetter(newChar)) {
				if (Character.isUpperCase(newChar)) {
					isUpper = true;
				}
				
				//Gets the Ascii number for the char
				int codePoint = (int) newChar + incrementAmount;
				
				//rolls the letter back if goes over z
				if (isUpper) {
					if (codePoint > (int) 'Z') {
						codePoint -= 25;
					}
				}
				else {
					if (codePoint > (int) 'z') {
						codePoint -= 25;			
									}
				}
				//Turns the Ascii number into a char then a String
				String updatedLetter = String.valueOf((char) codePoint);
				
				//appends changed letter into the final string 
				encodedMessage += updatedLetter;
			}
			else {
				encodedMessage += String.valueOf((char) newChar);
			}
			
			
			
		}
		return encodedMessage;
	}
	
	public static void CaesarCipherDecrypt(String encodedMessage) {
		//Test Code
		//Random random = new Random();
		//CaesarCipher.CaesarCipherDecrypt(CaesarCipher.CaesarCipherEncrypt("This is a very long Sentence!", random.nextInt(25 - 1 + 1) + 1));
		
		int counter = 0;
		System.out.println("Encoded Message");
		System.out.println(encodedMessage);
		System.out.println();
		System.out.println("Manual Scan required to find uncoded Message");
		System.out.println("Attempts to break Cipher:");
		System.out.println();
		
		while (counter != 26) {

			String decodedMessage = "";
			
			for (int i = 0; i < encodedMessage.length(); i++) {
				
				Boolean isUpper = false;
				char newChar = encodedMessage.charAt(i);
				if (Character.isLetter(newChar)) {
					if (Character.isUpperCase(newChar)) {
						isUpper = true;
					}
					
					//Gets the Ascii number for the char
					int codePoint = (int) newChar - counter;
					
					
					
					//rolls the letter back if goes over z
					if (isUpper) {
						if (codePoint < (int) 'A') {
							codePoint += 25;
						}
					}
					else {
						if (codePoint < (int) 'a') {
							codePoint += 25;			
										}
					}
					//Turns the Ascii number into a char then a String
					String updatedLetter = String.valueOf((char) codePoint);
					
					//appends changed letter into the final string 
					decodedMessage += updatedLetter;
				}
				else {
					decodedMessage += String.valueOf((char) newChar);
				}
				
				
				
			}
			System.out.println(decodedMessage);
			counter += 1;
			
		}
		
		
		
	}

}
