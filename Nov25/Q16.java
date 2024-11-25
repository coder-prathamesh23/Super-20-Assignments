package com.tka.Nov25;

public class Q16 {

	public static void main(String[] args) {
		System.out.println("All Triplets From The Given Array Whose Sum is 25 or Greater :- ");
		int[] arr = { 1, 2, 9, 8, 7, 6 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if((arr[i]+arr[j]+arr[k])>=25) {
						System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
					}
				}
			}
		}

	}

}
