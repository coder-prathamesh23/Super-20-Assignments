package com.tka.Nov25;



public class Q13 {
	public static void main(String[] args) {
		int[] arr = {1,6,9,4,0,2,5};
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Largest Element in given array  :- "+ arr[1]);
	}
}
