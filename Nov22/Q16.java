package com.tka.Nov22;

import java.util.Scanner;

public class Q16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number TO Find Its Factorial :- ");
		int num = sc.nextInt();
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact *=i;
		}
		System.out.println("Factorial :- "+fact);
	}

}