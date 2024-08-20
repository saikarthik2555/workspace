package operation;

import java.io.IOException; 
import java.io.PrintWriter;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/square")
public class SquareServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int number=Integer.parseInt(req.getParameter("num"));
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("The Square of the number "+number +" is "+(number*number)+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Input.html");		
		rd.include(req, res);
	}
}
