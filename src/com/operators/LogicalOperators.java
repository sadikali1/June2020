package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 15;
		
		System.out.println(a > b && b++ > c);  // False && True == False
											   // True && True = TRUE
											   // False && False = False
											   // True && False = False
		System.out.println(b);
		
		System.out.println(a > b | b > c);  // False && True == True
											// True && True = TRUE
											// False && False = False
											 // True && False = True
	}

}


// && ||  logical operator
// & |   bitwise operator
	
