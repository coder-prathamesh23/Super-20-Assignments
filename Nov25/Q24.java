package com.tka.Nov25;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q24 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String To Find Duplicates In it :- ");
		String str = new String(sc.next());
		TreeMap<Character, Integer> tmap = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int count = 1;
			for (int j = 0; j < str.length(); j++) {
				if (i != j) {
					if (c == str.charAt(j)) {
						count++;
					}
				}
			}
			if (count > 1) {
				tmap.put(c, count);
			}
		}
		System.out.println("Duplicate Character(s) In the Provided String :- ");
		for (Map.Entry<Character, Integer> entry : tmap.entrySet()) {
			System.out.println(entry.getKey() + " occured " + entry.getValue() + " times");
		}
	}
}
