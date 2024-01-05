package com.excelon.app;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		    int wDay = 0;

		    System.out.printf("Enter weekday number (0-6): ");
		    wDay = s.nextInt();

		    switch (wDay) {
		    case 0:
		      System.out.printf("Sunday");
		      break;

		    case 1:
		      System.out.printf("Monday");
		      break;

		    case 2:
		      System.out.printf("Tuesday");
		      break;

		    case 3:
		      System.out.printf("Wednesday");
		      break;

		    case 4:
		      System.out.printf("Thursday");
		      break;

		    case 5:
		      System.out.printf("Friday");
		      break;
		    case 6:
		      System.out.printf("Saturday");
		      break;

		    default:
		      System.out.printf("Invalid weekday number.");
		    }
		    System.out.printf("\n");
		  }
	

	}

