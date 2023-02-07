package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
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
}
