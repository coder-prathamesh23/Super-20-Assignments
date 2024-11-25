package com.tka.Nov25;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,0,98,87,76,65,54,43,32,21};
		System.out.println("Original Array :- ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("Prime Numbers In Array :- ");
		for(int i = 0;i<arr.length;i++) {
			int num = arr[i];
			if(num == 0 || num == 1) {

			}
			else if(num%2==0 ) {
				if(num!=2) {
					
				}
				else {
					System.out.print(" "+num);
				}
			}
			else {
				int f=0;
				for(int j=3;j<(num/2);j++) {
					if(num%j==0) {
						f=1;
						break;
					}
				}
				if(f==1) {
					
				}
				else {
					System.out.print(" "+num);
				}
			}
		}
	}
	
}
