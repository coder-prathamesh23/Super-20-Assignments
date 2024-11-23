package com.tka.Nov22;

import java.util.TreeMap;

public class Q29 {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 7, 3, 0, 6, 3, 6, 3, 1, 7, 3, 1, 4, 7, 5, 8, 3, 2, 4, 6, 2, 6, 8, 4, 2, 8, 0, 7, 4, 3, 1, 1,
				3, 5, 6, 8, 9 };
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int occ = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					occ++;
				}
				
			}
			tm.put(arr[i], occ);
		}
		System.out.println(tm);

	}

}
