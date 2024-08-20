package using_3techniques;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String pswd=req.getParameter("pswd");
		UserBean ub=new CustomerDAO().check(uname,pswd);
		if(ub==null) {
			req.setAttribute("msg", "Invalid UserName or Password");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}else {
			HttpSession hs=req.getSession();
			hs.setAttribute("ubean", ub);
			req.getRequestDispatcher("customer.jsp").forward(req, res);
		}
		
	}
}
