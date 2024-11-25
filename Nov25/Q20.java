package com.tka.Nov25;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int term = (int) Math.pow((Math.pow(10, i) - 1) / 9, 2);
            System.out.println(term);
        }
    }
	
}
