package operation;

import java.io.IOException;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/cal")
public class OperationServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String type=req.getParameter("s1");
				if(type.equals("Prime")){
					RequestDispatcher rd=req.getRequestDispatcher("prime");
				rd.forward(req, res);
				}
				else if(type.equals("Factor")) {
					RequestDispatcher rd=req.getRequestDispatcher("factor");
					rd.forward(req, res);
				}
				else if(type.equals("Factorial")) {
					RequestDispatcher rd=req.getRequestDispatcher("factorial");
					rd.forward(req, res);
				}
				else {
					RequestDispatcher rd=req.getRequestDispatcher("customer.jsp");
					rd.forward(req, res);
					
				}	
	
	}
}
