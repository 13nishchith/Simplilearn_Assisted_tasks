package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBConnection;
import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url="jdbc:mysql://localhost:3306/world";
		String username="root";
		String password="root1234";
		PrintWriter out=response.getWriter();
		String pid=request.getParameter("pid");
		out.println("welcome"+"</br>");
		
		out.print("<html><body>");
		try {
			DBConnection connection= new DBConnection(url, username, password);
			Connection connection1=connection.getConnection();
			PreparedStatement stmt=connection1.prepareStatement("select * from product where pid=?");
			stmt.setString(1, pid);
			ResultSet query=stmt.executeQuery();
			while(query.next()) {
				out.println("<table>");
				out.println("<style>table,tr,td{border:1px solid red; padding:10px;)</style>");
				out.println("<tr>");
				out.println("<th>Product Id</th>");
				out.println("<th>Product name</th>");
				out.println("<th>Product Price</th>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>"+query.getInt(1)+"</td>");
				out.println("<td>"+query.getString(2)+"</td>");
				out.println("<td>"+query.getString(3)+"</td>");
				out.println("</tr>");
				out.println("</table>");
				stmt.close();
				connection.closeConnection();
				out.println("</body></html>");
				connection.closeConnection();
				
			}
			
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	} catch (SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
