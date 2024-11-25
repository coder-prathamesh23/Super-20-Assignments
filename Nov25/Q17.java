package com.tka.Nov25;

import java.util.ArrayList;
import java.util.List;

public class Q17 {

	public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8}; // Input array
        int start = 1;              // Start of the range
        int end = 10;               // End of the range

        List<Integer> missingNumbers = findMissingNumbers(arr, start, end);

        System.out.println("Input array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nMissing numbers: " + missingNumbers);
    }
	
	public static List<Integer> findMissingNumbers(int[] arr, int start, int end) {
        // Create a boolean array to track presence of numbers
        boolean[] present = new boolean[end + 1];

        // Mark numbers present in the input array
        for (int num : arr) {
            if (num >= start && num <= end) {
                present[num] = true;
            }
        }

        // Find missing numbers
        List<Integer> missingNumbers = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            if (!present[i]) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
	
	
}
