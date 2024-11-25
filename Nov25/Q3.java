package com.tka.Nov25;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number to Check if it is Neon or not :- ");
		int num = sc.nextInt();
		int square = num*num;
		int sum = 0;
		while(square>0) {
			int rem = square%10;
			sum= sum+rem;
			square/=10;
		}
		if(num==sum) {
			System.out.println(num+" is a Neon Number");
		}else {
			System.out.println(num+" is NOT a Neon Number");
		}
		
	}
	
}
