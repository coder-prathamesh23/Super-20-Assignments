package com.tka.Nov25;

public class Q15 {

	public static void main(String[] args) {
		System.out.println("All Duplets From The Given Array :- ");
		int[] arr = {1,2,3,4,5,6};
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				for(int k = 0;k<arr.length;k++) {
					System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
				}
			}
		}
		
	}
	
}