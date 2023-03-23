package org.howard.edu.lsp.hw5;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	@Test
	@DisplayName("Test cases for toString method")
	void testToString() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0);  
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		
		assertEquals("[0, 2, 3, 4]", testSet1.toString());
		
		IntegerSet testSet2 = new IntegerSet();
		

		
		assertEquals("[]", testSet2.toString());
	} 
	


	@Test
	@DisplayName("Test cases for add method")
	void testAdd() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0);  
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		
		assertEquals("[0, 2, 3, 4]", testSet1.toString());
	} 
	
	@Test
	@DisplayName("Test cases for clear method")
	void testClear() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0);  
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		
		testSet1.clear();
		
		assertEquals("[]", testSet1.toString());
		
		
		IntegerSet testSet2 = new IntegerSet();
		
		testSet2.clear();
		
		assertEquals("[]", testSet2.toString());
	} 
	

	
	@Test
	@DisplayName("Test cases for remove method")
	void testRemove() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0);  
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		
		testSet1.remove(0);  
		testSet1.remove(2);
		testSet1.remove(3);
		
		assertEquals("[4]", testSet1.toString());
		
		
		IntegerSet testSet2 = new IntegerSet();
		
		testSet2.remove(0);  
		testSet2.remove(2);
		testSet2.remove(3);
		
		assertEquals("[]", testSet2.toString());
	} 
	
	
	

	
	@Test
	@DisplayName("Test cases for length method")
	void testLength() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0);  
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		
		Integer expectedLength1 = testSet1.length();
		
		assertEquals(expectedLength1, 4);
		
		
		IntegerSet testSet2 = new IntegerSet();
		
		Integer expectedLength2 = testSet2.length();
		
		assertEquals(expectedLength2, 0);
	} 
	
	
	
	
	@Test
	@DisplayName("Test cases for diff method")
	void testDiff() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0);  
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);		
		testSet1.add(25);  
		testSet1.add(32);
		testSet1.add(33);
		testSet1.add(54);
		
		IntegerSet testSet2 = new IntegerSet();
		
		testSet2.add(0);  
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		
		testSet1.diff(testSet2);
		
		assertEquals("[25, 32, 33, 54]", testSet1.toString());
		
		IntegerSet testSet3 = new IntegerSet();
		
		testSet3.add(0);  
		testSet3.add(2);
		testSet3.add(3);
		testSet3.add(4);		
		testSet3.add(25);  
		testSet3.add(32);
		testSet3.add(33);
		testSet3.add(54);
		
		IntegerSet testSet4 = new IntegerSet();
		
		testSet3.diff(testSet4);
		
		assertEquals("[0, 2, 3, 4, 25, 32, 33, 54]", testSet3.toString());
		
		
		IntegerSet testSet5 = new IntegerSet();
		
		IntegerSet testSet6 = new IntegerSet();
		
		testSet6.add(0);  
		testSet6.add(2);
		testSet6.add(3);
		testSet6.add(4);
		
		testSet5.diff(testSet6);
	
		assertEquals("[]", testSet5.toString());
		
		
		
		
		IntegerSet testSet7 = new IntegerSet();
		
		IntegerSet testSet8 = new IntegerSet();
		
		testSet7.diff(testSet8);
		
		assertEquals("[]", testSet7.toString());
		
		
	} 
	
	

	
	@Test
	@DisplayName("Test cases for intersect method")
	void testIntersect() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0); 
		testSet1.add(25);  
		testSet1.add(32);
		testSet1.add(33);
		testSet1.add(54);
		
		
		IntegerSet testSet2 = new IntegerSet();
		
		testSet2.add(0);  
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		
		testSet1.intersect(testSet2);
		
		assertEquals("[0]", testSet1.toString());
		
		
		IntegerSet testSet3 = new IntegerSet();
		
		testSet3.add(0); 
		testSet3.add(25);  
		testSet3.add(32);
		testSet3.add(33);
		testSet3.add(54);
		
		IntegerSet testSet4 = new IntegerSet();
		
		testSet3.intersect(testSet4);
		
		assertEquals("[]", testSet3.toString());
		
		IntegerSet testSet5 = new IntegerSet();
		
		IntegerSet testSet6 = new IntegerSet();
		
		testSet6.add(0);  
		testSet6.add(2);
		testSet6.add(3);
		testSet6.add(4);
		
		testSet5.intersect(testSet6);
		
		assertEquals("[]", testSet5.toString());
		
		IntegerSet testSet7 = new IntegerSet();
		
		IntegerSet testSet8 = new IntegerSet();
		
		testSet7.intersect(testSet8);
		
		assertEquals("[]", testSet7.toString());
	}
	
	
	
	@Test
	@DisplayName("Test cases for union method")
	void testUnion() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0); 
		testSet1.add(25);  
		testSet1.add(32);
		testSet1.add(33);
		testSet1.add(54);
		
		IntegerSet testSet2 = new IntegerSet();
		
		testSet2.add(0);  
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		
		testSet1.union(testSet2);
		
		assertEquals("[0, 25, 32, 33, 54, 2, 3, 4]", testSet1.toString());
		
		
		IntegerSet testSet3 = new IntegerSet();
		
		testSet3.add(0); 
		testSet3.add(25);  
		testSet3.add(32);
		testSet3.add(33);
		testSet3.add(54);
		
		IntegerSet testSet4 = new IntegerSet();
		
		testSet3.union(testSet4);
		
		assertEquals("[0, 25, 32, 33, 54]", testSet3.toString());
		
		IntegerSet testSet5 = new IntegerSet();
		
		IntegerSet testSet6 = new IntegerSet();
		
		testSet6.add(0);  
		testSet6.add(2);
		testSet6.add(3);
		testSet6.add(4);
			
		testSet5.union(testSet6);
		
		assertEquals("[0, 2, 3, 4]", testSet5.toString());
		
		IntegerSet testSet7 = new IntegerSet();
		
		IntegerSet testSet8 = new IntegerSet();
			
		testSet7.union(testSet8);
			
		assertEquals("[]", testSet7.toString());
	}
	
	
	
	@Test
	@DisplayName("Test cases for equals method")
	void testEquals() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0);  
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
			
		
		IntegerSet testSet2 = new IntegerSet();
		
		testSet2.add(0);  
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);	
		
		boolean expectedBoolean = testSet1.equals(testSet2);
			
		assertEquals(true, expectedBoolean);
		

		
		testSet1.add(0);  
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
				
		
		
		testSet2.add(1);  
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
			
		expectedBoolean = testSet1.equals(testSet2);
			
		assertEquals(false, expectedBoolean);
		
		testSet1.clear();
		testSet2.clear();
			
		expectedBoolean = testSet1.equals(testSet2);
			
		assertEquals(true, expectedBoolean);
	}
	
	
	
	
	@Test
	@DisplayName("Test cases for largest method")
	void testLargest() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0); 
		testSet1.add(25);  
		testSet1.add(32);
		testSet1.add(33);
		testSet1.add(54);
			
		try {
			assertDoesNotThrow(() -> testSet1.largest());

			assertEquals(54, testSet1.largest());
			
		}
		catch(Exception e) {
			fail("Exception thrown when not supposed to");
			
		}
		
		IntegerSet testSet2 = new IntegerSet();
		
		assertThrows(IntegerSetException.class, ()-> testSet2.largest());
	}
	
	@Test
	@DisplayName("Test cases for largest method to check if appropriate method is thrown")
	void testLargestException() {
	
	IntegerSet testSet1 = new IntegerSet();
	
	Exception exception = assertThrows(IntegerSetException.class, ()-> testSet1.largest());
	assertEquals("IntegerSetException: Set is Empty", exception.getMessage());
	}

	
	
	@Test
	@DisplayName("Test cases for smallest method")
	void testSmallest() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0); 
		testSet1.add(25);  
		testSet1.add(32);
		testSet1.add(33);
		testSet1.add(54);
			
		try {
			assertDoesNotThrow(() -> testSet1.smallest());

			assertEquals(0, testSet1.smallest());
			
		}
		catch(Exception e) {
			fail("Exception thrown when not supposed to");
			
		}
		
		IntegerSet testSet2 = new IntegerSet();
		
		assertThrows(IntegerSetException.class, ()-> testSet2.smallest());


	}
	
	@Test
	@DisplayName("Test cases for smallest method to check if appropriate exception is thrown")
	void testSmallestException() {
		IntegerSet testSet1 = new IntegerSet();
		
		Exception exception = assertThrows(IntegerSetException.class, ()-> testSet1.smallest());
		assertEquals("IntegerSetException: Set is Empty", exception.getMessage());
}

	
	@Test
	@DisplayName("Test cases for contains method")
	void testContains() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0); 
		testSet1.add(25);  
		testSet1.add(32);
		testSet1.add(33);
		testSet1.add(54);
		
		assertEquals(true, testSet1.contains(54));
		
		assertEquals(false, testSet1.contains(77));
		
		testSet1.clear();
		
		assertEquals(false, testSet1.contains(77));
	}
	
	
	@Test
	@DisplayName("Test cases for isEmpty method")
	void testIsEmpty() {
		IntegerSet testSet1 = new IntegerSet();
		
		assertEquals(true, testSet1.isEmpty());
		
		testSet1.add(0); 
		testSet1.add(25);  
		testSet1.add(32);
		testSet1.add(33);
		testSet1.add(54);
		
		assertEquals(false, testSet1.isEmpty());
	}
	
	
	@Test
	@DisplayName("Test cases for getSet method")
	void testGetSet() {
		IntegerSet testSet1 = new IntegerSet();
		
		testSet1.add(0); 
		testSet1.add(25);  
		testSet1.add(32);
		testSet1.add(33);
		testSet1.add(54);
		
		
		List<Integer> expectedSet =  Arrays.asList(0,25,32,33,54);
		
		assertEquals(expectedSet.toString(), testSet1.toString());
		
		testSet1.clear();

		
		expectedSet =  Arrays.asList();
		
		assertEquals(expectedSet.toString(), testSet1.toString());
	}	
}


