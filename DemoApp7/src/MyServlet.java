import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/* ServletConfig & ServletContext - both can be be used to specify the initial values in XML which can be used in servlet programs. 
 * ServletContext is an object which will be shared by all the servlets. 
 * For different configuration for each servlets, we would use ServletConfig.
 * That means if we have 5 servlets, we ll have 5 ServletConfig and just 1 ServletContext for them.
 * They can be used for storing information like root login, password for databases and others.
*/
public class MyServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		
		// We are creating object of ServletContext
		// ServletContext is an interface.
		// When we say getServletContext() we get the method from HttpServlet as HttpServlet extends generic servlet.
		// Also we can get its object from req.getServletContext(). When we do so Tomcat returns its object.
		ServletContext ctx = getServletContext();
		
		// Here using getInitParameter() we are obtaining the passed parameter value from XML file
		String str = ctx.getInitParameter("name");
		String str2 = ctx.getInitParameter("phone");
		out.println("hii! "+ str +" you have been using "+ str2 );
		
		
		ServletConfig cfg = getServletConfig();
		String str3 = cfg.getInitParameter("name");
		out.println("Using ServletConfig the name is "+ str3);
	}
}
