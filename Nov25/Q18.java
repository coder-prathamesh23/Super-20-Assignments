package com.tka.Nov25;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = sc.nextInt();
		int[][] matrix = new int[rows][columns];
		int[][] transpose = new int[columns][rows];
		System.out.println("Enter First Array :- ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.println("Original Matrix :- ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose Of Matrix :- ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}

	}

}
