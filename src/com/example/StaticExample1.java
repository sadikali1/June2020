package com.example;

public class StaticExample1 {

	static String name = "Javed";
	String fName = "Rajesh";
	
	public static void main(String[] args) {		
		test1();
	}
	
	public void print() {
		System.out.println(name);
		test1();
	}

	public static void test1() {		
		System.out.println("Testing static "+name);
	}
}


// Methods 
// Variable
// Data Types 