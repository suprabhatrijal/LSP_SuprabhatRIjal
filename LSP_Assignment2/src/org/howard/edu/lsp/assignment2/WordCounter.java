package org.howard.edu.lsp.assignment2;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.HashMap;



public class WordCounter {
	// checks if a string contains only number
	public static boolean isNumeric(String string) {
	    int intValue;
	    
	    if(string == null || string.equals("")) {
	        return false;
	    }
	    
	    try {
	        intValue = Integer.parseInt(string);
	        return true;
	    } catch (NumberFormatException e) {
	    }
	    return false;
	}
	
	// reads a file and returns the entire string 
	public static String readFile(String filePath) throws FileNotFoundException {

		File file = new File(filePath);
		Scanner reader = new Scanner(file);
		String text = "";
		while (reader.hasNextLine()) {
			text = text.concat(reader.nextLine());	
		}
		reader.close();
		return text;
	}
	
	public static void main(String[] args){
		String filePath = System.getProperty("user.dir").concat("/src/main/resources/words.txt");
		
		String text;
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		try {
			text = readFile(filePath);
			// remove all special characters
			text = text.replaceAll("[^a-zA-Z0-9\\s]", "");
			String[] arrOfWords = text.split(" ");
			for (String word: arrOfWords) {
				word = word.toLowerCase();
				if (word.length() > 3 && !isNumeric(word)) {
					wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+1);
				}
			}
			for (String word1: wordCountMap.keySet()) {
				if (wordCountMap.get(word1) != null) {
					System.out.printf("%s %d\n", word1, wordCountMap.get(word1));				
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}

