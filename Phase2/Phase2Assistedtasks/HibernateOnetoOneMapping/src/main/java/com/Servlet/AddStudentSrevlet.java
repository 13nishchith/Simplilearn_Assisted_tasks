package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



import com.entity.PhoneNumber;
import com.entity.Student;
import com.util.HibernateUtil;

/**
 * Servlet implementation class AddStudentSrevlet
 */
@WebServlet("/add_student")
public class AddStudentSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentSrevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("add_student.html").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student = populateStudent(request);
		SessionFactory sf =HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx =session.beginTransaction();
		session.save(student);
		tx.commit();
		
		PrintWriter out = response.getWriter();
		out.println("Student saved successfully!");
	}

	private Student populateStudent(HttpServletRequest request) {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		
		String phone1 = request.getParameter("phone_1");
		String phoneType1 = request.getParameter("types1");
		
		String phone2 = request.getParameter("phone_2");
		String phoneType2 = request.getParameter("types2");
		
		
		String phone3 = request.getParameter("phone_3");
		String phoneType3 = request.getParameter("types3");
		
		Student student = new Student();
		student.setFname(fname);
		student.setLname(lname);
		
		PhoneNumber p1 = new PhoneNumber();
		p1.setPhonenumber(phone1);
		p1.setPhonetype(phoneType1);
		p1.setStudent(null);
		
		PhoneNumber p2 = new PhoneNumber();
		p2.setPhonenumber(phone2);
		p2.setPhonetype(phoneType2);
		p2.setStudent(null);
		
		PhoneNumber p3 = new PhoneNumber();
		p3.setPhonenumber(phone3);
		p3.setPhonetype(phoneType3);
		p3.setStudent(null);
		
		
		
		List<PhoneNumber> phones  = new ArrayList();
		phones.add(p1);
		phones.add(p2);
		phones.add(p3);
		
		student.setPhoneNumber(phones);
		
		
		// ------------------ Populate Courses
		List<Student> students = new ArrayList();
		students.add(student);
		
		
		return student;
	}

}
