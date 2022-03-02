package Servlet;

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
 * Servlet implementation class insertOperation
 */
@WebServlet("/insertoperation")
public class insertOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertOperation() {
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
		out.print("<html><body>");
		
		
		try {
			DBConnection conn = new DBConnection(url, username, password);
			Connection connection=conn.getConnection();
			Statement stmt=connection.createStatement();
			
			stmt.executeUpdate("insert into eproduct_27012022(eproduct_id,eproduct_name,eproduct_price)values(11,'dell3',68000)");
			out.println("executed the insert operation"+"</br>");
			
			stmt.executeUpdate("update eproduct_27012022 set eproduct_price=5000 where eproduct_name=('dell')");
			out.println("executed the update operation"+"</br>");
			
			stmt.executeUpdate("delete from eproduct_27012022 where eproduct_name=('lenevo')");
			out.println("executed delete operation"+"</br>");
			
			stmt.close();
			conn.closeConnection();
			
			out.println("</body></html>");
			conn.closeConnection();
			out.println("done");
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
