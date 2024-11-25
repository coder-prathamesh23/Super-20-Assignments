package com.tka.Nov25;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To check Perfect Or Not :- ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		for(int i = 1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			System.out.println(num+" is a Perfect Number..");
		}else {
			System.out.println(num+" is NOT a Perfect Number..");
		}
		
	}
	
}
