package com.tka.Nov22;

import java.util.Scanner;

public class Q20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Calculate Sum of Digits :- ");
		int num = sc.nextInt(),sum=0, temp=num;
		while(num>0) {
			int rem = num%10;
			sum = sum+rem;
			num/=10;
		}
		System.out.println("Sum of Digits of "+temp+" is "+sum);
		
	}

}
