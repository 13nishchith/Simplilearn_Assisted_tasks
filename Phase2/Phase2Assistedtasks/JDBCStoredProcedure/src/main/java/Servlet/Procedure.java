package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBConnection;

/**
 * Servlet implementation class Procedure
 */
@WebServlet("/procedure")
public class Procedure extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Procedure() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/sys";
		String userName = "root";
		String password = "root1234";
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		try {
			DBConnection conn=new DBConnection(url, userName, password);
			Connection connection=conn.getConnection();
			CallableStatement stmt=conn.getConnection().prepareCall("{call add_product(?,?,?)}");
			stmt.setInt(1, 10);
			stmt.setString(2,("new product") );
			stmt.setBigDecimal(3, new BigDecimal(1900.50));
			stmt.executeUpdate();
			
			out.println("stored procedure has been executed");
           stmt.close(); 
            
            out.println("</body></html>");
            conn.closeConnection();


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
