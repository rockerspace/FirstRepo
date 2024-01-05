package com.excelon.app;

import  java.util.Scanner;

public class condition1 {

	public static void main(String[] args) {
		var s=new Scanner(System.in);
		System.out.println("Enter a value");
		int accountBalance=s.nextInt();
		System.out.println("a value is"+ accountBalance);
		if (accountBalance>0)
		{
			System.out.println("Valid account");
		}
		else {
			System.out.println("{Invalid account");
		}

	}

}
