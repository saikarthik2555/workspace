package details;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/sqi")
public class SquareServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int ans=Integer.parseInt(req.getParameter("vali"));
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("The Square Of the "+ans+" is "+(ans*ans));
		
	}

}
