package com.excelon.app;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);

		    int number = 0;

		    System.out.printf("Enter a positive integer number: ");
		    number = s.nextInt();

		    switch (number % 2) {
		    case 0:
		      System.out.printf("%d is an EVEN number.\n", number);
		      break;

		    case 1:
		      System.out.printf("%d is an ODD number.\n", number);
		      break;
		    }

		  }
		

	}


