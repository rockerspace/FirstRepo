package com.excelon.app;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	    char ch;

	    System.out.printf("Enter a character: ");
	    ch = s.next().charAt(0);

	    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	      switch (ch) {
	      case 'A':
	      case 'E':
	      case 'I':
	      case 'O':
	      case 'U':
	      case 'a':
	      case 'e':
	      case 'i':
	      case 'o':
	      case 'u':
	        System.out.printf("%c is a VOWEL.\n", ch);
	        break;

	      default:
	        System.out.printf("%c is a CONSONANT.\n", ch);
	      }
	    } else {
	      System.out.printf("%c is not an alphabet.\n", ch);
	    }
	  }
	

	}


