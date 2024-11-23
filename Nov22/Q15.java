package com.tka.Nov22;

public class Q15 {
	
	public static void main(String[] args) {
		
		int sumE = 0,sumO=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sumE+=i;
			}
			else {
				sumO+=i;
			}
		}
		System.out.println("Sum of Even Numbers From 1 to 10 :- "+sumE);
		System.out.println("Sum of Odd Numbers From 1 to 10 :- "+sumO);
	}

}
