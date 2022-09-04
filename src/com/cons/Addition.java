package com.cons;

public class Addition {
	
	public int add(int a) {
		int sum  = a + 10;
		return sum;
	}

	public int add(int a, int b) {
		int sum  = a + b;
		return sum;
	}
	
	public int add(int a, int b, int c) {
		int sum  = a + b +c;
		return sum;
	}
	
	public String add(int a, String b) {
		String result  = a + b;
		return result;
	}
	
	public String add(String b, int a) {
		String result  = a + b;
		return result;
	}
	
	public String add(String name, String lastname) {
		String fullName = name + " " + lastname;
		return fullName;
	}

}

// Method overloading, Static binding, Compile time polymorphism
//Method Override, Runtime polymorphism, dynamic binding