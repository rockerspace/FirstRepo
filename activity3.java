package com.excelon.app;

import java.util.Scanner;

public class activity3 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        int c = 1;
			int a = 2;
			int b = 3;
			int greatest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);

	        System.out.println("The greatest number is: " + greatest);

	}

}
