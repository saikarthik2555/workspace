package details;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/cali")
public class PrimeSquareFactServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String value=req.getParameter("s1i");
		if(value.equals("Primei")) {
			RequestDispatcher rd=req.getRequestDispatcher("pi");
			rd.forward(req, res);
		}
		else if(value.equals("Factori")) {
			RequestDispatcher rd=req.getRequestDispatcher("fi");
			rd.forward(req, res);
		}
		else if(value.equals("Factoriali")) {
			RequestDispatcher rd=req.getRequestDispatcher("facti");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("sqi");
			rd.forward(req, res);
		}
		
	}

}
