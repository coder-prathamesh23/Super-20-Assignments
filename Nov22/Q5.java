package com.tka.Nov22;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check POSITIVE/NEGATIVE :- ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println(num+" is POSITIVE...");
		}
		else {
			System.out.println(num+" is NEGATIVE...");
		}
		
		
	}
	
}
