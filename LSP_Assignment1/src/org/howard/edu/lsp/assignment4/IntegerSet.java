package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


/**
 * 
 * @author Suprabhat Rijal (@03060000)
 * This is IntegerSetException class which is extended from the Exception class.
 */

class IntegerSetException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public IntegerSetException(String errorMessage) {
		super(errorMessage);
	}
}


/**
 * 
 * This the main class IntegerSet to implement set data structure.
 * This class has multiple methods that correspond to various set operations
 */

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * This is the Default Constructor .
	 */
	public IntegerSet() {
		
	}
	
	/**
	 * This method clears the internal representation of the set.
	 * i.e. it turns any set into an empty/null set
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * This method return the length of the set.
	 * i.e. the number of elements in the set
	 * @return the length of the set
	 */
	
	public int length() {
		return set.size();
	} 
	
	
	/**
	 * This method takes in a IntergerSet and checks if it equal with the other and returns a boolean value for it.
	 * @param b a IntegerSet class
	 * @return true if sets are equal else false
	 */
	
	public boolean equals(IntegerSet b) {
		set.sort(null);
		b.getSet().sort(null);
		if (set.equals(b.getSet())) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * This method takes in a integer and checks if it is present the set
	 * @param value a integer value to check if it contains in the set.
	 * @return true if value is present in the set else false
	 */
	
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	/**
	 * This method returns the largest element in the set.
	 * @return the maximum value in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	
	public int largest() throws IntegerSetException {
		if (set.size()==0) {
			throw new IntegerSetException("IntegerSetException: Set is Empty");
	
		} 	
			
		return (Collections.max(set));
	
		
	}
	
	/**
	 * This method returns the smallest element in the set.
	 * @return the maximum value in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	
	public int smallest() throws Exception {
		if (set.size()==0) {
			throw new IntegerSetException("IntegerSetException: Set is Empty");
		} 
		
		return Collections.min(set);
	}
	
	/**
	 * This method adds the integer value specified into the set.
	 * @param value a integer to add in the set if it is not.
	 */
	
	public void add(int value) {
		if (!set.contains(value)) {
			set.add(value);
		}
	}
	
	/**
	 * This method removes the item specified from the set.
	 * @param item a integer to remove from the set.
	 */
	
	public void remove(int item) {
		if (set.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
	}
	
	/**
	 * This method performs Union of two sets.
	 * @param intSetb a IntegerSet to perform union with.
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> setb=intSetb.getSet();
		for (int i = 0; i < setb.size();i++) {
			if (!set.contains(setb.get(i))){
				set.add(setb.get(i));
			}
			
		}	
		
	}
	
	/**
	 * This method performs the intersection of the set.
	 * @param intSetb a IntergerSet to perform the intersection with.
	 */
	
	public void intersect(IntegerSet intSetb) {
		List<Integer> setb=intSetb.getSet();
		List<Integer> setb_clone = new ArrayList<Integer>(setb);
		setb.clear();
		for (int i=0; i<setb_clone.size();i++) {
			if (set.contains(setb_clone.get(i))) {
				setb.add(Integer.valueOf(set.get(i)));
	
			}
		}
	}
	
	/**
	 * This method removes the intersection of the two sets(main set and intSetb) from the main set
	 * @param intSetb a IntegerSet whose elements are removed from first set.
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> setb=intSetb.getSet();
		for (int i=0; i<setb.size();i++) {
			if (set.contains(setb.get(i))) {
				set.remove(setb.get(i));
			}
		}
	}
	
	/**
	 * This methods checks if the set is empty and returns the boolean value accordingly.
	 * @return (boolean) true if set is empty else false
	 */
	
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	/**
	 * This method converts the set to string.
	 * @return string representation of the set.
	 */
	public String toString() {
		return set.toString();
	}
	
	/**
	 * This method returns the set.
	 * @return set of the class.
	 */
	
	public List<Integer> getSet() {
		return set;
	}
	
	
	
}