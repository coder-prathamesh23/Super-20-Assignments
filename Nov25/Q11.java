package com.tka.Nov25;

import java.util.ArrayList;

public class Q11 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 6, 9, 4, 9, 4, 2, 4, 8, 4, 8, 0, 4, 6, 9, 2, 1, 6, 0 };
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=0) {
				if ((arr[i] % 2 == 0) && arr[i] != 0) {
					even.add(arr[i]);
				}
				else {
					odd.add(arr[i]);
				}
			}
		}
		System.out.println("Even Numbers From The Given Array :- "+even);
		System.out.println("Odd Numbers From The Given Array :- "+odd);
	}

}
