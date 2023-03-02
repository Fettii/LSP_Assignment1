package org.howard.edu.lsp.assignment4.javadocs;
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
		
		if(set.containsAll(b) == true) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	public boolean contains(int value) {
		if(set.contains(value) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int largest() {
		
		int max = 0;
		
		for (int i = 0; i < set.size();i++) {
			if(set[i] > max) {
				max = set[i];
			}
			
		}
		
	}
	
	
	
	
	
	
	
	}
	
	
