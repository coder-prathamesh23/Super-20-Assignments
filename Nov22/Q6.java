package com.tka.Nov22;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :- ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number ;- ");
		int num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println("Both Numbers Are Equal...");
		}
		else if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}
		else {
			System.out.println(num2+" is greater than "+num1);
		}
		
	}

}
