package com.hidden.example;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserInfoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uid = request.getParameter("txtuid");
		String uname = request.getParameter("txtuname");
		PrintWriter out = response.getWriter();
		
		// we are creating another html form here. For every varible we would like to use on the next page needs to be passed.
		out.println("<form action = 'UserCurrentInfo'>");
		out.println("<input type = 'hidden' name = 'txtuid' value='" + uid + "'>");
		out.println("<input type = 'hidden' name = 'txtuname' value='" + uname + "'>");
		out.println("<input type ='text' name = 'txtphone' placeholder ='enter your phone number' >");
		out.println("<input type = 'submit' value = 'submit'>");
		out.println("</form>");
		
		
        // we can also just move to UserCurrentInfo but only two peramiters will be passed can add more to the index.html to pass more
		
//		RequestDispatcher rd = request.getRequestDispatcher("UserCurrentInfo");
//		rd.forward(request, response);
		
		
		
		// if you do not want to use the RequestDispatcher class you and you can also pass the information by:
		
//		response.sendRedirect("UserCurrentInfo?txtuid=" + uid + "&txtuname=" + uname);
		
	}

}
