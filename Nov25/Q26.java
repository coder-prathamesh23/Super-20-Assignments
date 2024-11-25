package com.tka.Nov25;

import java.util.Scanner;

public class Q26 {

	public static void toLowerConvert(String sb) {
		char[] c = sb.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int a = c[i];
			a += 32;
			c[i] = (char) a;
		}
		String s2 = new String(c);
		System.out.println("New String :- " + s2);

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String To Convert it to Lowercase :- ");
		String sb = new String(sc.nextLine());
		System.out.println("Original SB :- " + sb);
		toLowerConvert(sb.toUpperCase());
	}
}