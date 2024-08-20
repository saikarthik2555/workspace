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
@WebServlet("/factorial")
public class FactorialServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int ans=1;
		int number=Integer.parseInt(req.getParameter("num"));
		while(number!=0) {
			ans=ans*number--;
		}
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("The Factorial of the number is "+ans+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Input.html");		
		rd.include(req, res);
	}
}
