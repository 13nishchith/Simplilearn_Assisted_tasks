package serv;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/result")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
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
			DBConnection conn=new DBConnection(url, userName, password);
			Connection connection=conn.getConnection();
			Statement stmt=connection.createStatement();
			
			//stmt.executeUpdate("insert into eproduct_27012022(eproduct_id,eproduct_name,eproduct_price)values(2,'dell',15000)");
			//stmt.executeUpdate("insert into eproduct_27012022(eproduct_id,eproduct_name,eproduct_price)values(3,'lenevo',19000)");
			//stmt.executeUpdate("insert into eproduct_27012022(eproduct_id,eproduct_name,eproduct_price)values(4,'microsoft',12654)");
			stmt.executeUpdate("insert into eproduct_27012022(eproduct_id,eproduct_name,eproduct_price)values(5,'yoga',18654)");
			
			ResultSet rs=stmt.executeQuery("select * from eproduct_27012022");
		
			while(rs.next()) {
				out.println(rs.getInt("eproduct_id")+ " "+rs.getString("eproduct_name")+" "+rs.getDouble("eproduct_price")+"</br>");
			}
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
