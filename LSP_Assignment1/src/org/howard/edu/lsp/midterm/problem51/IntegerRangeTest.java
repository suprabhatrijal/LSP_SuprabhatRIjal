package org.howard.edu.lsp.midterm.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.assignment5.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerRangeTest {

	@Test
	@DisplayName("Test case for contains")
	void testContains () {
		IntegerRange testRange1 = new IntegerRange(1,5);
		
		assertEquals(true, testRange1.contains(2));
		assertEquals(true, testRange1.contains(1));
		assertEquals(true, testRange1.contains(5));
		
		assertEquals(false, testRange1.contains(0));
		assertEquals(false, testRange1.contains(6));
		
	}
	
	@Test
	@DisplayName("Test case for Size")
	void testRange () {
		IntegerRange testRange1 = new IntegerRange(1,5);
		
		assertEquals(5, testRange1.size());
		
		IntegerRange testRange2 = new IntegerRange(1,1);
		
		assertEquals(1, testRange2.size());
		
		IntegerRange testRange3 = new IntegerRange(2,55);
		
		assertEquals(54, testRange3.size());
	
	}
	
	@Test
	@DisplayName("Test cases for overlaps method to check if appropriate exception is thrown")
	void testOverlaps() {
		IntegerRange testRange1 = new IntegerRange(1,5);
		IntegerRange testRange2 = new IntegerRange(2,7);
		
		try {
			assertEquals(true, testRange1.overlaps(testRange2));		
		}
		catch (Exception e) {
			fail("Unexpected exception thrown");
		}
		testRange1 = new IntegerRange(1,5);
		testRange2 = new IntegerRange(2,7);

}

	@Test
	@DisplayName("Test cases for overlaps method to check if appropriate exception is thrown")
	void testOverlapsException() {
		IntegerRange testRange1 = new IntegerRange(1,5);
		
		Exception exception = assertThrows(EmptyRangeException.class, ()-> testRange1.overlaps(null));
		assertEquals("Null Range was passed.", exception.getMessage());
}
}
