package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Dashbord
 */
@WebServlet("/Dashbord")
public class Dashbord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashbord() {
        super();
        // TODO Auto-generated constructor stub
    }
    
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	HttpSession session=request.getSession(false);
	if(session!=null) {
		String s1=(String)session.getAttribute("username");
		
		out.print("==!Welcome to dashbord!= "+s1+"</br>");
		
		out.println("<form action='logout' method='post'>");
		out.println("<input type='submit' value='logout'>");
		out.println("</form>");
		
		
	}
	}
}

