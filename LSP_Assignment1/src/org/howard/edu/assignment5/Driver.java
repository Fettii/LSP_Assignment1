package org.howard.edu.assignment5;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println(“Value of Set1 is:” + set1.toString());
		System.out.println(“Smallest value in Set1 is:” + set1.smallest());
		System.out.println(“Largest value in Set1 is:” + set1.largest());

		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);


	}

}
