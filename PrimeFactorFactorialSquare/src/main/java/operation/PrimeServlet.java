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
@WebServlet("/prime")
public class PrimeServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String str=null;
		int number=Integer.parseInt(req.getParameter("num"));
		for(int i=2;i<=number/2;++i) {
			if(number%i==0) {
				str="Not Prime"; break;
			}
			str="Prime"; 
		}
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("The number "+number +" is "+str+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Input.html");		
		rd.include(req, res);
	}

}
