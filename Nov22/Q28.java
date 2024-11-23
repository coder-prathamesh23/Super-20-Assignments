package com.tka.Nov22;

import java.util.ArrayList;

public class Q28 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,6,3,7,9,4,9,45};
		ArrayList alist = new ArrayList();
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
			alist.add(arr[j]);
		}
		System.out.print("Original Array :- [");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println("Reversed Array :- "+alist);
		
	}

}
