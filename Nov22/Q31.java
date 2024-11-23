package com.tka.Nov22;

import java.util.Scanner;

public class Q31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :- ");
		String s = sc.next();
		s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
			}
		}
	}
}
