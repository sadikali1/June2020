package com.str;

public class StringBufferExample {

	String st = "QA";
	
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("QA");
		
		//StringBuffer str2 = new StringBuffer("QA");
		
		System.out.println(str1);
		System.out.println(str1.hashCode());
		str1 = str1.append("Test");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		//str1.insert(1, "Testing");
		//System.out.println(str1);
		
		//str1.replace(1, 5, "Dev");
		//System.out.println(str1);
		
		//str1.delete(1, 3);
		//System.out.println(str1);
		
		System.out.println(str1.reverse());
	}

}

//1, 2 