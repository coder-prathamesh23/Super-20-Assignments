package com.tka.Nov25;

import java.util.Map;
import java.util.TreeMap;

public class Q9 {

	public static void main(String[] args) {

		TreeMap<Integer, Integer> hmap = new TreeMap<Integer, Integer>();
		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 6, 9, 4, 9, 4, 2, 4, 8, 4, 8, 0, 4, 6, 9, 2, 1, 6, 0 };

		for (Integer i = 0; i < arr.length; i++) {
			Integer occ = 1;
			for (Integer j = 0; j < arr.length; j++) {
				if (occ < 2) {
					if (i != j) {
						if (arr[j] == arr[i]) {
							occ++;
						}
					}
				}
			}

			hmap.put(arr[i], occ);
		}
		for(Map.Entry<Integer, Integer> entry:hmap.entrySet()) {
			System.out.println(entry.getKey()+" occured "+entry.getValue()+" times");
		}

	}

}
