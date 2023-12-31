package com.registration.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Naveen Wodeyar
 * @Date 31-12-2023
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/regForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		
		// retrieve the values from request objet,
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String city = request.getParameter("city");
			String password = request.getParameter("password");
		
		// Establish the connection,
			try{
				// 1. Load the driver,
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// 2. Establish the connection,
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg2023");
				
				// 3. 
			}
			catch (Exception e) {
				System.out.println(e.getCause());
			}
		
	}

}
