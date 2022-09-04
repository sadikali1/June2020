package com.control;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int age = 19;
		int weight = 45;
		
		if(age > 18) {			
			if(weight > 50) {
				System.out.println("Eligible for blood donation");
			}else {
				System.out.println("Weight is less tha 50, he is not eligible for blood donation");
			}
			
		}else {
			System.out.println("Not Eligible for blood donation");
		}
	}

}
