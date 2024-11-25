package com.tka.Nov25;

import java.util.Scanner;

public class Q25 {

	public static int find(String s,int start) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Substring  To Find:- ");
		String sub = sc.nextLine();
		if(s == null || start < 0 || start >= s.length()) {
			return -1;
		}
		else {
			for(int i =0;i<s.length()-sub.length();i++) {
				int j;
				for(j = 0;j<sub.length();j++) {
					if(s.charAt(i+j)!=sub.charAt(j)) {
						break;
					}
				}
				if(j==sub.length()) {
					return j;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("enter The String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("The element was found at :- "+find(str,3)+" index");
	}
	
}
