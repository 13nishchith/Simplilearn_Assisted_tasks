import java.sql.*;
public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/word","root","root1234");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from actor");
		
		rs.next();
		int actor_id=rs.getInt("actor_id");
		String first_name=rs.getString("fname");
		String last_name=rs.getString("lname");
		Date last_update=rs.getDate("date");
		System.out.println(actor_id+ " "+first_name+" "+last_name+" "+last_update);
		stmt.close();
		con.close();		

	}

}
