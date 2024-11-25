package com.tka.Nov25;

import java.util.Scanner;

public class Q19 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of terms
	        System.out.print("Enter the number of terms in the Triplet Fibonacci series: ");
	        int n = scanner.nextInt();

	        // Handle edge cases
	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	            return;
	        }

	        // Initialize the first three terms
	        int t1 = 0, t2 = 1, t3 = 1;

	        System.out.print("Triplet Fibonacci series: ");
	        if (n == 1) {
	            System.out.print(t1);
	        } else if (n == 2) {
	            System.out.print(t1 + " " + t2);
	        } else {
	            System.out.print(t1 + " " + t2 + " " + t3);

	            // Generate the series
	            for (int i = 4; i <= n; i++) {
	                int next = t1 + t2 + t3;
	                System.out.print(" " + next);

	                // Update the terms
	                t1 = t2;
	                t2 = t3;
	                t3 = next;
	            }
	        }
	    }
	
}

