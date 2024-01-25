package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet5
 */
@WebServlet("/Servlet7")
public class servlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is esablished.........");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1", "root", "Drive456@N");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from user");
				ResultSetMetaData rsdm= rs.getMetaData();
				out.print("<table border="+1+">"+ "<tr>");
		    for (int i = 1; i < rsdm.getColumnCount(); i++) {
	    		 out.print("<th>"+rsdm.getColumnName(i)+"</th>");
		    }
		    out.print("</tr>");
			while(rs.next())
			{out.print("<tr>");
			for (int i = 1; i < rsdm.getColumnCount(); i++) {
	    		 out.print("<td>"+rs.getString(i)+"</td>");
				
			}
			out.print("</tr>");	
			}
			out.print("</table>");
			
		}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
