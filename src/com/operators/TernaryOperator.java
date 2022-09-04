package com.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		int max = (a>b) ? a : b;
		
		System.out.println(max);
		
		int number = 21;
		
		String message = (number % 2 == 0) ? "Even Number" : "Odd Number";
		System.out.println(message);
		
	}
}


 //  condition ? :