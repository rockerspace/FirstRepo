package com.app;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

//import java.sql.ResultSet;

import java.sql.SQLException;

//import java.sql.Statement;



public class DeleteDemo {



	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver is established.........");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1", "root", "Drive456@N");

			

			PreparedStatement psmt=con.prepareStatement("DELETE FROM student WHERE STNAME=? AND STNO=?");

			

			

			psmt.setString(1, "Narendra");

			psmt.setInt(2, 103);

		psmt.setString(2, "chloe@gmail.com");

			

			

			int x=psmt.executeUpdate();

		    

			if(x>0)

				System.out.println(x+ "  Records are Deleted.....");

			else

				System.out.println("No Record Deleted");

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


