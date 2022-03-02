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
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginservlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	if(username.equalsIgnoreCase("nishchith") && password.equalsIgnoreCase("nisch@123")) {
			HttpSession session=request.getSession();
		session.setAttribute("username",username );
		response.sendRedirect("Dashbord");
}
	else {
		request.getRequestDispatcher("login.html").include(request, response);
		out.print("Incorrect details");
	}

}
}


	