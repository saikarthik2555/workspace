package details;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/fi")
public class FactorialServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int ans=Integer.parseInt(req.getParameter("vali"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int result=1;
		while(ans!=1) {
			result=result*ans;
			ans--;
		}
		pw.println("The factorial  is "+result);
	}

}
