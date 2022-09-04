package com.cons;

public class Students {
	
	String name;
	int number;
	String email;	

	public Students(String name, int number, String email) {
		this.name = name;
		this.number = number;
		this.email = email;
	}
	
	public void print(){
		int a = 10;
		String name = "Testing";
		System.out.println(name + " "+ number + " " + email );
	}

	public static void main(String[] args) {
		System.out.println("Main method started..........");
		
		Students obj1 = new Students("Rajesh", 1, "test1@gmail.com");		
		obj1.print();
		
		Students obj2 = new Students("Javed", 20, "test@gmail.com");		
		obj2.print();	
		
	}

}

// Class, Object, Polymorphism, Inheritance , Encapulation, Abstraction


// Method overloading 
// Method overriding 

// Two ways

// Abstract class --  0 - 100%
// Interface ---  100%

