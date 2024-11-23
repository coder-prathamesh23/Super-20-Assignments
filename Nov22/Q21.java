package com.tka.Nov22;

import java.util.Scanner;

public class Q21 {
	
	public static void main(String[] args) {
		
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter Number To Calculate Count Of Digits in It :- ");
		int num = sc.nextInt();
		int i=0;
		while(num>0) {
			i++;
			num/=10;
		}
		System.out.println("There Are '"+i+"' Digits in The Number");
		
	}

}
