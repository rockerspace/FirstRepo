package com.excelon.app;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
	       if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }  
	   }

	private static boolean isPrime(int n) {
		return false;
	}  

	}	

