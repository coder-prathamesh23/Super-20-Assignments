package com.tka.Nov22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		ArrayList<Integer> alist = new ArrayList<Integer>();
		System.out.println("Enter First Number :- ");
		alist.add(sc.nextInt());
		System.out.println("Enter Second Number :- ");
		alist.add(sc.nextInt());
		System.out.println("Enter Third Number :- ");
		alist.add(sc.nextInt());
		
		Collections.sort(alist.reversed());
		System.out.println("Maximum from Enterned Numbers is :- "+alist.getFirst());
		
	}
	
}
