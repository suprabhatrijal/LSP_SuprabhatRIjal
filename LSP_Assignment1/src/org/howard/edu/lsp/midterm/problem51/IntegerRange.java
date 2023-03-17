package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range {
	private int lower; 
	private int upper; 
	
	
	public int getLower() {
		return this.lower;
	}
	
	public int getUpper() {
		return this.upper;
	}
	
	public IntegerRange (int lower, int upper) {
		this.lower = lower;
		this.upper = upper;
		
	}
	
	@Override
	public boolean contains(int value) {
		// TODO Auto-generated method stub
		return this.lower <= value && value <= this.upper;
	}

	@Override
	public boolean overlaps(Range other) throws EmptyRangeException {
		// TODO Auto-generated method stub
		if (other == null) 
		{
			throw new EmptyRangeException("Null Range was passed.");
		}
		else
		{
			if ((this.upper >= other.getLower()) || (other.getUpper() >= this.lower)){
				return true;
			}
			else {
				return false;
			}
					
					
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.upper - this.lower + 1;
	}

}
