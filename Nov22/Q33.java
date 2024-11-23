package com.tka.Nov22;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for (int i = 0, j = c.length - 1; i < (c.length / 2); i++, j--) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
		String str = new String(c);
		System.out.println(str);

	}

}
