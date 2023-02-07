package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.io.FileNotFoundException;


public class Driver {

	public static void main(String[] args){
		String filePath = System.getProperty("user.dir").concat("/src/main/resources/words.txt");
		
		String text;
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		try {
			text = FileReader.readFile(filePath);
			// remove all special characters
			text = text.replaceAll("[^a-zA-Z0-9\\s]", "");
			String[] arrOfWords = text.split(" ");
			for (String word: arrOfWords) {
				word = word.toLowerCase();
				if (word.length() > 3 && !Utils.isNumeric(word)) {
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

