package com.tka.Nov25;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To find The Prime Number After It :- ");
		int n = sc.nextInt();

		for (int num = n + 1; num > n; num++) {
			

			if (num == 0 || num == 1) {
				
			} else if (num % 2 == 0) {
				if (num != 2) {

				} else {
					System.out.println("The next Prime Number After "+n+" is :-"+num);
					break;
				}
			} else {
				int f = 0;
				for (int i = 3; i < (num / 2); i++) {
					if (num % i == 0) {
						f = 1;
						break;
					}
				}
				if (f == 1) {

				} else {
					System.out.println("The next Prime Number After "+n+" is :-"+num);
					break;
				}
			}
			
		}

	}
}
