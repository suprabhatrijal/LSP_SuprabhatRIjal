package org.howard.edu.lsp.assignment4;

/**
 * 
 * @author Suprabhat Rijal (@03060000)
 * Test file to test all the methods as well as Exception Handling
 */
public class Driver {
	
	/**
	 * @throws Exception while calling largest and smallest function if the set is empty.
	 * Prints all the test cases with their outputs from IntegerSet and its method implementations
	 */
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("            Testing IntergerSet methods for set1   ");
		System.out.println("/------------------------------------------------------------------/");
		
		IntegerSet set1=new IntegerSet();
		
		System.out.println(" Set1 initialized as empty set, set1: " + set1.toString());
		System.out.println("");
		System.out.println(" Adding new elements to set1 using the IntegerSet.add() method:  ");
		
		//Adds the value to the set1
		set1.add(66);
		System.out.println(" Added value 66  ");
		
		set1.add(4);
		System.out.println(" Added value 4  ");
		
		set1.add(19);
		System.out.println(" Added value 19  ");
		
		set1.add(20);
		System.out.println(" Added value 20  ");
		
		System.out.println(" Value of Set1 after adding elements -> " + set1.toString());
		
		set1.add(20);
		System.out.println(" Value of Set1 after adding 20 again. As expected there are no duplicates. " + set1.toString());
		
		
		// print the length of set1
		System.out.println("");
		System.out.println("set1 has the length: " + set1.length());
		
		// print smallest value of set1
		System.out.println(" Smallest value of set1 is: " + set1.smallest());
		
		// print largest value of set1
		System.out.println(" Largest of set1 is: " + set1.largest());
		System.out.println("");
		
		
		// Testing the contains method
		System.out.println(" Checking if 20 is contained in set1 using set1.contains(20): Expected: true, got: " + set1.contains(20));
		
		System.out.println(" Checking if 34 is contained in set1 using set1.contains(34): Expected: false, got:  " + set1.contains(34));
		System.out.println("");
		
		// Testing remove
		System.out.println(" Removing 20 from set1 using set1.remove(20) ");
		set1.remove(20);
		System.out.println(" Values of set1 after removing 20: " + set1.toString());
		System.out.println(" Removing 20 from set1 again using set1.remove(20) ");
		set1.remove(20);
		System.out.println(" Values of set1 before calling set1.remove(20) again -> " + set1.toString());
		System.out.println(" Removing 5 again, Note removing a element that is not present does nothing -> " + set1.toString());
		System.out.println("");
		
		
		
		
		System.out.println("            Testing IntergerSet methods for set2   ");
		System.out.println("/------------------------------------------------------------------/");
		IntegerSet set2=new IntegerSet();
		System.out.println(" Set2 initialized as empty set, set1: " + set2.toString());
		System.out.println("");
		System.out.println(" Adding elements to set2 using set2.add()  ");
		set2.add(11);
		System.out.println("Added the value 11 to set2");
		set2.add(25);
		System.out.println("Added the value 25 to set2");
		set2.add(67);
		System.out.println("Added the value 67 to set2");
		set2.add(88);
		System.out.println("Added the value 88 to set2");
		set2.add(22);
		System.out.println("Added the value 22 to set2");
		System.out.println("Value of Set2 after adding elements: " + set2.toString());
		System.out.println("");
	
		set1.clear();
		set1.add(1);
		set1.add(67);
		set1.add(25);
		set1.add(7);
		
		//Calling the difference method
		System.out.println("Difference of Set1 and Set2 i.e set1-set2 ...");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.diff(set2);
		System.out.println("Result of difference of Set1 - Set2 using set1.diff(set2) is " +set1.toString());
		System.out.println("");
		set1.clear();
		set1.add(67);
		set1.add(25);
		set1.add(1);
		set1.add(86);
		set2.clear();
		set2.add(67);
		set2.add(2);
		set2.add(1);
		set2.add(55);
		set2.add(77);
		
		//Calling the intersection method
		System.out.println("Intersection of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.intersect(set2);
		System.out.println("Result of Intersection of Set1 and Set2 using set1.intersect(set2) is: " +set2.toString());
		System.out.println("");
		
		set1.clear();
		set1.add(67);
		set1.add(25);
		set1.add(1);
		set1.add(86);
		set2.clear();
		set2.add(67);
		set2.add(2);
		set2.add(1);
		set2.add(55);
		set2.add(77);
		
		//Checking union 
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.union(set2);
		System.out.println("Result of union of Set1 and Set2 using set1.union(set2) is " +set1.toString());
		System.out.println("");
		
		set1.clear();
		set1.add(67);
		set1.add(25);
		set1.add(1);
		set1.add(86);
		set2.clear();
		set1.add(67);
		set1.add(25);
		set1.add(1);
		set1.add(86);
		
		//Checking if two sets are equals
		System.out.println("Check if the Set1 and Set2 are equal");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Set1 and Set2 are equal? using set1.equals(set2) " + set1.equals(set2));
		System.out.println("");
		
		set1.clear();
		set1.add(67);
		set1.add(25);
		set1.add(1);
		set1.add(86);
		set2.clear();
		set1.add(63);
		set1.add(25);
		set1.add(1);
		set1.add(86);
		
		System.out.println("Clearing Set1 and Set2: ");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.clear();
		set2.clear();
		System.out.println("");
		System.out.println("Now clearning the set1 and set2 using set1.clear() and set2.clear() ");
		System.out.println("Value of Set1 after clearing : " + set1.toString());
		System.out.println("Value of Set2 after clearing : " + set2.toString());
		System.out.println("");
		
		System.out.println("Value of set1 "+ set1.toString());
		System.out.println("Is Set1 Empty? using set1.isEmpty() " + set1.isEmpty());
		
		//checking IntegerSetException
		
		System.out.println("");
		System.out.println("Checking IntegerSetException while finding the largest element from the set: ");
		System.out.println("Value of set1 "+ set1.toString());
		System.out.print("Calling set1.largest(): ");
		//Let's check IntegerSetException while finding greatest from empty set
		try {
			set1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());

		}
		
		//Let's check IntegerSetException while finding smallest from empty set
		
		System.out.println("");
		System.out.println("Checking IntegerSetException while finding the smallest element from the set: ");
		System.out.println("Value of set1 "+ set1.toString());
		System.out.print("Calling set1.smallest(): ");
		
		 try {set1.smallest();}
		 catch (IntegerSetException e) {
				System.out.println(e.getMessage());

			}
		
	}

}