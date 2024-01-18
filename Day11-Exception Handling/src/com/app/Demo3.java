package com.app;

public class Demo3 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub

		int age=19;
		
	       if(age>18)
	       {
	    	   System.out.println("Eligable for votar ID");
	       }
	       else
	       {
	    	   throw new AgeException();
	       }
		}

	}
