package com.tka.Nov22;

import java.util.Scanner;

public class Q18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Find Prime or Not :- ");
		int num = sc.nextInt();
		if(num == 0 || num == 1) {
			System.out.println(num+" is neither Prime nor Composite..");
		}
		else if(num%2==0 ) {
			if(num!=2) {
				System.out.println(num+" is Composite..");
			}
			else {
				System.out.println(num+" is Prime..");
			}
		}
		else {
			int f=0;
			for(int i=3;i<(num/2);i++) {
				if(num%i==0) {
					f=1;
					break;
				}
			}
			if(f==1) {
				System.out.println(num+" is Composite..");
			}
			else {
				System.out.println(num+" is Prime..");
			}
		}
		
		
	}

}
