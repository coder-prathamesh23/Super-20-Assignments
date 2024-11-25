package com.tka.Nov25;

import java.util.TreeMap;

public class Q7 {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> hmap = new TreeMap<Integer, Integer>();
		Integer arr[] = {10,20,50,30,20,10};
		
		for(Integer i = 0;i<arr.length;i++) {
			Integer occ = 1;
			for(Integer j = 0;j<arr.length;j++) {
				if(occ<2) {
					if(i !=j) {
						if(arr[j]==arr[i])
						{
							occ++;
						}
					}
				}
			}
			if(occ  <2) {
				hmap.put(arr[i], occ);
			}
		}
		System.out.println("Unique elements In the Array Are :-"+hmap);
		
	}

}
