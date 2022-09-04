package com.control;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		int i = 1;
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(startTime + 30000);
		long endTime = startTime + 5000;
		
		/*
		while(startTime < endTime) {
			startTime = System.currentTimeMillis();
			System.out.println(startTime);
			System.out.println(endTime);
		}
		
		while(i<=10) {
			System.out.println(i);
			i++;
		} */
		
		while(i<=10) {
			System.out.println(i);			
		} 
	}

}
