package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBConnection;

/**
 * Servlet implementation class DBOperations
 */
@WebServlet("/dataoperations")
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBOperations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/world";
		String userName = "root";
		String password = "root1234";
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		try {
			
			DBConnection con=new DBConnection(url, userName, password);
		
			Connection connection=con.getconnection();
			
			Statement stmt= connection.createStatement();
			
			stmt.executeUpdate("create database mydatabase");
			out.println("Created database:mydatabase</br>");
			
			stmt.executeUpdate("use mydatabase");
			out.println("Selected database:mydatabase</br>");
			
			stmt.executeUpdate("drop database mydatabase");
			stmt.close();
			
			out.println("Dropped database:mydatabase</br>");
			
		} catch (ClassNotFoundException e) {
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
