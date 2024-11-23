package com.tka.Nov22;

import java.util.Scanner;

public class Q32 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String :- ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String :- ");
		String s2 =sc.nextLine();
		
		if(s1.length() == s2.length()) {
			System.out.println("Both are Equal in Length..");
		}
		else if(s1.length()>s2.length()) {
			System.out.println(s1+" is greater in length");
		}
		else {
			System.out.println(s2+" is greated in length");
		}
		
	}

}
