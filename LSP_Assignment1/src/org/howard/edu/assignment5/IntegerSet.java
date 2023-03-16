package org.howard.edu.assignment5;
import java.util.*;


public class IntegerSet {
	

		
	private List<Integer> set = new ArrayList<Integer>();
		

	
	public void clear() {
		
		set.clear();
		
	}
	
	public int length() {
		return set.size();
	}
	
	public boolean equals(IntegerSet b) {
		
		if(set.containsAll(b) && b.containsAll(set)) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
	

	public boolean contains(int value) {
		if(set.contains(value)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int largest() {
		
		int max = set.get(0);
		
		
		if(set.isEmpty()) {
			
		
			throw new IntegerSetException("empty list");
		}
			
			else{
				
			for (int i = 1; i < set.size(); i++) {
	            if (set.get(i) > max) {
	                max = set.get(i);
	            }
	        }
	        return max;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	}
	
	
