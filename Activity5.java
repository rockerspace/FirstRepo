package com.excelon.app;

import java.util.Scanner;


public class Activity5 {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    char gender;

	    System.out.printf("Enter gender as (M/m or F/f): ");
	    gender = s.next().charAt(0);

	    switch (gender) {
	    case 'M':
	    case 'm':
	      System.out.printf("Male.");
	      break;

	    case 'F':
	    case 'f':
	      System.out.printf("Female.");
	      break;

	    default:
	      System.out.printf("Unspecified Gender.");
	    }
	    System.out.printf("\n");
	  }
	

	}


