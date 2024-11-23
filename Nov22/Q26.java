package com.tka.Nov22;

public class Q26 {
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,6,3,7,9,4,9,45};
		int small=Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("The Smallest Number in Array Is :- "+small);
	}

}
