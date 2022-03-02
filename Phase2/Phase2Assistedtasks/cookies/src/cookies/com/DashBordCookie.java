package cookies.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.RepaintManager;

/**
 * Servlet implementation class DashBordCookie
 */
@WebServlet("/DashBordCookie")
public class DashBordCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashBordCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Cookie[] cookie=request.getCookies();
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			boolean value=true;
			if(cookie!=null) {
				for(Cookie c:cookie) {
					if(c.getName().equals("userid")) {
						out.println("welcome: "+c.getValue());
						value=true;
						break;
					}
				}
			}
			if (!value) {
				out.println("No userId found in cookie <br/>");
			}

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
