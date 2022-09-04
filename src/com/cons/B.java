package com.cons;

public class B extends A {
	
	public B() {
		super("Testing");
		System.out.println("B Default constructor invloked");
	}
	
	public B(String name) {
		this();
		System.out.println("B Parametrized constructor invloked " + name);		
	}
}


// Object 