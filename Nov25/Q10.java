package com.tka.Nov25;

public class Q10 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int[] rra = new int[arr.length];
		
		for(int j=0,i = arr.length-1;i>=0;j++,i--) {
			rra[j] = arr[i];
		}
		System.out.print("Original Array :- ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Reversed Array :- ");
		for(int i = 0;i<rra.length;i++) {
			System.out.print(rra[i]+" ");
		}
		
	}
	
}
