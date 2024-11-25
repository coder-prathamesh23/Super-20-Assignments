package com.tka.Nov25;

import java.util.ArrayList;
import java.util.Collections;

public class Q12 {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(5);
		alist.add(4);
		alist.add(3);
		alist.add(2);
		alist.add(1);
		
		Collections.sort(alist);
		System.out.println("Sum of minimum and maximum element in an array :- "+(alist.getFirst()+alist.getLast()));
		
	}
	
}
