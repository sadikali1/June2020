package com.control;

public class LoopExample1 {

	public static void main(String[] args) {
		
		/*
		for(int i=10; i>=1; i--) {
			System.out.println(i*2);
		} */
		
		
		for(int i=1; i<=5; i++) {
			
			if(i==2) {
				break;
			}
			for(int j=1; j<=10; j++ ) {
				System.out.print(i*j + " ");
			}
			System.out.println("");
		}
	}

}


// Three type of loop
//  for/foreach, while, dowhile 