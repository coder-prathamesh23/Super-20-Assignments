package com.tka.Nov22;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Reverse The Digits :- ");
		int num = sc.nextInt(),rev=0, temp=num;
		while(num>0) {
			int rem = num%10;
			rev = (rev*10)+rem;
			num/=10;
		}
		System.out.println("Reverse of "+temp+" is "+rev);
		
	}
	
}
