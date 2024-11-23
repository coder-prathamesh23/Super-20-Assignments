package com.tka.Nov22;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check Even/Odd :- ");
		int num = sc.nextInt();
		if(num==0) {
			System.out.println(num+" is NEUTRAL...");
		}
		else if(num%2==0) {
			System.out.println(num+" is EVEN...");
		}
		else {
			System.out.println(num+" is ODD");
		}
	}

}
