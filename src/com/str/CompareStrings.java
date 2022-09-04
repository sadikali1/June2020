package com.str;

public class CompareStrings {

	public static String concatWithString() {
		String t = "Java";
		for (int i = 0; i < 10000; i++) {
			t = t + "Testing";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		StringBuilder sb = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Testing");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		
		
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
