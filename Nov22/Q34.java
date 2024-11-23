package com.tka.Nov22;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Check if it is Palindrome or no :- ");
		String s = new String(sc.nextLine());
		char[] c = s.toCharArray();
		for (int i = 0, j = c.length - 1; i < (c.length / 2); i++, j--) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
		String s1 = new String(c);
		if(s.equals(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}
	
}
