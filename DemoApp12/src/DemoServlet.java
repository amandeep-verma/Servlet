import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 JSTL tags are used to fetch the data without using java in jsp.
 We need to have getters and setters set in class in order to fetch the variables from a class.
 Here we are sending the variable, object and List of object to the jsp page and printing them using jstl tags
 */
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{

	//JSTL - JSP Standard Tag Library
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = "Amandeep";
		
		req.setAttribute("label", name);
		
		Student s = new Student(1,"John");
		req.setAttribute("student", s);
		
		List<Student> studs = new ArrayList<Student>();
		studs.add(s);
		studs.add(new Student(2,"Mayor"));
		studs.add(new Student(3,"Yami"));
		studs.add(new Student(4,"Prat"));
		
		req.setAttribute("group", studs);
		
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
}
