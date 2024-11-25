package com.tka.Nov25;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

		// Call the method to remove duplicates
		int[] uniqueArr = removeDuplicates(arr);

		// Print the result
		System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
	}

	public static int[] removeDuplicates(int[] arr) {
		int n = arr.length;
		// Create a temporary array to store unique elements
		int[] temp = new int[n];
		int index = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < index; j++) {
				if (arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				temp[index++] = arr[i];
			}
		}

		// Create a result array of the correct size
		int[] result = new int[index];
		System.arraycopy(temp, 0, result, 0, index);

		return result;
	}
}
