package com.tka.Nov22;

public class Q3 {
	
	public static void main(String[] args) {
		
		int n1 = 20;
		int n2 = 30;
		
		System.out.println("Before Swapping...");
		System.out.println("First Number :- "+n1);
		System.out.println("Second Number :- "+n2);
		System.out.println("__________________________________________________________________________________");
		
		n1 = n1^n2;
		n2 = n1^n2;
		n1 = n1^n2;

		System.out.println("\nAfter Swapping...");
		System.out.println("First Number :- "+n1);
		System.out.println("Second Number :- "+n2);
		
	}

}
