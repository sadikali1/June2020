package com.str;

public class Exampl21 {

	public static void main(String[] args) {
		String name = "QA";
		System.out.println(name.hashCode());
		name = name.concat("Tester");
		System.out.println(name.hashCode());
		name = name.concat(" Automation");
		System.out.println(name);
		System.out.println(name.hashCode());
		name = "Tester";
		System.out.println(name.hashCode());
		
		String name1 = "QA1";
		System.out.println(name1.hashCode());
		
	}

}

// String is Immutable -- We can not change value of String
