package com.array;

public class MultipeDimArrayExample {

	public static void main(String[] args) {
		int[][] a = { {1,2,3,4}, 
				     {10,20,30,40}, 
				     {100,200,300,400} };
		
		System.out.println(a[1][3]);
		
		for(int[] a1 : a) {
			for(int a2: a1) {
				System.out.print(a2 + " ");
			}
			System.out.println("");
		}
	}

}
