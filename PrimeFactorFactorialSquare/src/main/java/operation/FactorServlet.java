package operation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/factor")
public class FactorServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int number=Integer.parseInt(req.getParameter("num"));
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(int i=1;i<=number;++i) {
			if(number%i==0) {
				ar.add(i);
			}
		}
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("The Factors of the number "+number +" are "+ar+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Input.html");		
		rd.include(req, res);
	}

}
