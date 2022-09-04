package com.str;

public class Example2 {
	
	public static void main(String[] args) {
		String name1 = "QA";
		String name2 = "QA";
		String name4 = "QA Automation Tester";
		String name3 = new String("QA");
	
		System.out.println(name1.length());
		
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		System.out.println(name4.contains(name3));
		System.out.println(name4.startsWith("QA"));
		System.out.println(name4.endsWith("Tester"));
	
	}
	

}
