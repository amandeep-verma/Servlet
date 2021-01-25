

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */

// Make sure to add the servlet name for which we need to call this filter. Multiple servlet names can be added in between () using , 
@WebFilter("/addAlien")
public class IdFilter implements Filter {

    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	// Filter chain has the all filter, chain.doFilter calls the next Filter and this continues. When we are on the last filter, it 
	// will call the servlet. 
	// Before passing the request to the servlet , it has to go through all the filter assigned.
	// Since we need HttpServletRequest object we type cast ServletRequest parametre.
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req =(HttpServletRequest)request; // typecasting
		
		int aid = Integer.parseInt(req.getParameter("aid"));
		
		PrintWriter out = response.getWriter();
		
		// checking if aid is greater than 1
		if(aid>1)
		{
			// calls next filter, or if there is no next filter it calls the servlet.
			chain.doFilter(request, response);
		}
		else
		{
			out.println("Invalid input");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
