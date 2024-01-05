package com.excelon.app;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 100;
		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm = 0;

		System.out.println("The first 100 Fibonacci numbers are:");

		for (int i = 0; i < n; i++) {
			if (i <= 1) {
				nextTerm = i;
			} else {
				nextTerm = firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			}

			System.out.print(nextTerm + " ");
		}
	}
}
