package com.tka.Nov25;

import java.util.Scanner;

public class Q2 {
	public static int fact = 1;

	public void factorial(int num) {
		if (num > 1) {
			fact *= num;
			factorial(num - 1);
		} else {
			System.out.println("Factorial of " + num + " is :- " + fact);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Calculate Its Factorial :- ");
		int num = sc.nextInt();
		if (num == 0 || num == 1) {
			System.out.println("Factorial of 0 is :- -1");
		} else if (num < 0) {
			System.out.println("Factorial of Negative Numbers Cannot be Determined..");
		} else {
			Q2 q2 = new Q2();
			q2.factorial(num);
		}
	}
}
