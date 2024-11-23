package com.tka.Nov22;

import java.util.Scanner;

public class Q24 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Reverse The Digits :- ");
		int num = sc.nextInt(),arm=0, temp=num;
		while(num>0) {
			int rem = num%10;
			arm = (rem*rem*rem)+arm;
			num/=10;
		}
		if(arm==temp) {
			System.out.println(temp+" is Armstrong");
		}
		else {
			System.out.println(temp+" is NOT Armstrong");
		}
		
	}

}
