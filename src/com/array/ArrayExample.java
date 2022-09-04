package com.array;

public class ArrayExample {

	String name;
	
	public static void main(String[] args) {
		
		int a[] = new int[5]; // declaration
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		for(int a1 : a) {
			System.out.println(a1);
		}
		
		System.out.println(a[4]);
		/*
		int[] a = {10, 20, 30, 40, 50, 60 };
		
		System.out.println(a[0]);
		
		/*
		for(int i=0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		} */
		
		/*
		for(int a1 : a) {
			System.out.println(a1);
		} */
	}

}
