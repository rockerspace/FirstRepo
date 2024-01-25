package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.LoginDAO;
import com.app.model.LoginDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		out.println("<h1> Do post Method</h1>");
		String uname=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		out.println(uname+"             "+pswd);
		
		LoginDAO userdao=new LoginDaoImpl();
		String role=userdao.getRoleFromDB(uname, pswd);
		System.out.println("Role Servlet"+role);
	    RequestDispatcher rd;
		
		if(role.equals("hr"))
		{
			rd=request.getRequestDispatcher("/servlet5");
			rd.forward(request, response);
		}
		else if(role.equals("Manager"))
		{
			rd=request.getRequestDispatcher("/servlet6");
			rd.forward(request, response);
		}
		else if(role.equals("Employee"))
		{
			rd=request.getRequestDispatcher("/servlet7");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("fail.html");
			rd.forward(request, response);
		}
		
		
		
	}

}

