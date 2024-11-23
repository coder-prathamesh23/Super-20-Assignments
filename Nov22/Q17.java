package com.tka.Nov22;

import java.util.ArrayList;
import java.util.Scanner;

public class Q17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Find Its Factors :- ");
		int num = sc.nextInt();
		ArrayList<Integer> alist = new ArrayList<Integer>();
		String s = "";
		for(Integer i=2;i<=num;i++) {
			if(num%i==0) {
				alist.add(i);
			}
		}
		System.out.println("Factors of "+num+" :- "+alist);
	}

}
