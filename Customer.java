package Day4classesandobjects;

import java.util.Scanner;

public class Customer {
	int custNo;
	String custname;
	String location;

	public void insertCustomer()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Customer no:");
		custNo=s.nextInt();
		System.out.println("Enter Customer Name :");
		custname=s.next();
		System.out.println("Enter Customer location");
		location=s.next();
	}

	public void showCustomer()
	{
		System.out.println("Custono: "+ custNo +"     CustName:- "+ custname+"     Location :-"+location);
	
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
	}
}
