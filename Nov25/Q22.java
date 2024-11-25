package com.tka.Nov25;

import java.util.Scanner;
import java.util.TreeSet;

public class Q22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String To Find Duplicates In it :- ");
		String str = new String(sc.next());
		TreeSet<Character> tset = new TreeSet<Character>();
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			if(str.indexOf(c)!=str.lastIndexOf(c)) {
				tset.add(c);
			}
		}
		System.out.println("Duplicate Character(s) In the Provided String :- "+tset);
		
	}
	
}
