package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Color;
import com.entity.EProduct;
import com.entity.Finance;
import com.entity.OS;
import com.entity.ScreenSize;
import com.util.HibernateUtil;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/product_details")
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
        SessionFactory factory = HibernateUtil.buildSessionFactory();
        
        Session session = factory.openSession();
        
         
        List<EProduct> list = session.createQuery("from EProduct").list();
        
         PrintWriter out = response.getWriter();
         out.println("<html><body>");
         out.println("<b>Product Listing</b><br>");
         for(EProduct p: list) {
                 out.println("ID: " + String.valueOf(p.getId()) + ", Name: " + p.getName() +
                                 ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());
                 
                 List<Color> colors = p.getColors();
                 out.println("Colors: ");
                 for(Color c: colors) {
                         out.print(c.getColorid()+"&nbsp"+c.getName() + "&nbsp;");
                 }
                 
                 Collection<ScreenSize> sizes= p.getScreenSizes();
                 out.println(", Screen Sizes: ");
                 for(ScreenSize s: sizes) {
                         out.print(s.getScreeid()+"&nbsp"+s.getSize() + "&nbsp;");
                 }
                 
                 Set<OS> os= p.getOs();
                 out.println(", OS : ");
                 for(OS o: os) {
                         out.print(o.getOsid()+"&nbps"+o.getName() + "&nbsp;");
                 }
                 
                 Set<Finance> finance = p.getFinance();
                 out.println(", Finance Options: ");
                 for(Finance f:finance) {
                     out.println(f.getFinance_id()+"&nbps"+f.getFtype()+"&nbps"+f.getName() + " &nbsp;");
                 }
                 
                 
                 out.println("<hr>");
         }
                session.close();

     out.println("</body></html>");
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
