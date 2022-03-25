package com.hidden.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserCurrentInfo")
public class UserCurrentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserCurrentInfo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   
	   String uid = request.getParameter("txtuid");
	   String phone = request.getParameter("txtphone");
	   String uname = request.getParameter("txtuname");
	   PrintWriter out = response.getWriter();
				
	   out.println("user id = " + uid);
	   out.println("<br>");
	   out.println("name = " + uname + "<br>");
	   out.println("phone number = " + phone);
	   
				
	}

}
