package org.howard.edu.lsp.assignment2;

public class Utils {
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
}
