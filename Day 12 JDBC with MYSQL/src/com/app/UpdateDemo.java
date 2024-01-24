package com.app;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

//import java.sql.ResultSet;

import java.sql.SQLException;

//import java.sql.Statement;



public class UpdateDemo {



	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver is established.........");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1", "root", "Drive456@N");

			

			PreparedStatement psmt=con.prepareStatement("UPDATE student SET STNO=? WHERE STNAME=?");

			

			psmt.setInt(1, 102);

			psmt.setString(2, "Chloe");

		psmt.setString(2, "chloe@gmail.com");

			

			

			int x=psmt.executeUpdate();

		    

			if(x>0)

				System.out.println(x+ "  Records are Updated.....");

			else

				System.out.println("No Record Updated");

		    psmt.close();

		    con.close();

			

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



}


