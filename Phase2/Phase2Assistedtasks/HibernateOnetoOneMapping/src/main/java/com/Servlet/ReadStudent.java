package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Student;
import com.util.HibernateUtil;

/**
 * Servlet implementation class ReadStudent
 */
@WebServlet("/read_student")
public class ReadStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		SessionFactory sf=HibernateUtil.buildSessionFactory();
		Session session=sf.openSession();
		
		List<Student> Student=session.createQuery("form student").list();
		
		out.println("<h1> Stuent list:</h1>");
		out.print("<table>");
		out.print("<tr>");
		out.print("<th> student Id</th>");
		out.print("<th> student Fname</th>");
		out.print("<th> student Lnamem</th>");
		out.print("<th> student phonenumber</th>");
		out.println("</tr>");
		
		for(Student student:Student) {
			out.print("<tr>");
			out.print("<td>"+student.getStudentid()+"</td>");
			out.print("<td>"+student.getFname()+"</td>");
			out.print("<td>"+student.getLname()+"</td>");
			out.print("<td>"+student.getPhoneNumber()+"</td>");
			out.print("</tr>");
			}
			session.close();
			out.print("</table> </body> </html>");	
		}
		
		
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
