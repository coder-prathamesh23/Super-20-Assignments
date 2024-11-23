package com.tka.Nov22;

import java.util.Scanner;

public class Q35 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String :- ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String :- ");
		String s2 = sc.nextLine();
		
		if(s1.length()==s2.length()) {
			char[] s1c = s1.toCharArray();
			char[] s2c = s2.toCharArray();
			
			int s1cSum=0,s2cSum=0;
			
			for(int i=0;i<s1c.length;i++) {
				s1cSum += s1c[i];
				s2cSum += s2c[i];
				
			}
			
			if(s1cSum == s2cSum) {
				System.out.println(s1+" and "+s2+" are Anagrams..");
			}
		}
		else {
			System.out.println(s1+" and "+s2+" are not Anagrams..");
		}
		
	}

}
