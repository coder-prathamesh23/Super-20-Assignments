package com.tka.Nov25;


public class Q4 {

	public static void main(String[] args) {
		System.out.println("Prime Numbers From 1 to 100 :- ");
		for(int num = 1;num<=100;num++) {
			if(num == 0 || num == 1) {
				System.out.println(num+" is neither Prime nor Composite..");
			}
			else if(num%2==0 ) {
				if(num!=2) {
				}
				else {
					System.out.println(num);
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
				}
				else {
					System.out.println(num);
				}
			}
		}
		
	}
	
}
