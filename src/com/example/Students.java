package com.example;

public class Students {
	
	String name;
	int number;
	String email;
	
	static int collegeId;
	
	public void print(){
		int a = 10;
		String name = "Testing";
		System.out.println(name + " "+ number + " " + email + " "+collegeId);
	}


	public static void main(String[] args) {
		System.out.println("Main method started..........");
		
		Students obj1 = new Students();
		obj1.name = "Rajesh";
		obj1.number = 1;
		obj1.email = "test1@gmail.com";
		obj1.collegeId = 10;
		obj1.print();
		
		Students obj2 = new Students();
		obj2.collegeId = 20;
		obj2.name = "Javed";
		obj2.print();
		
		System.out.println(obj1.collegeId );
		
		ClassExample1 cObject = new ClassExample1();
		int result = cObject.sum(10, 30);
		System.out.println(result);
	}
}
