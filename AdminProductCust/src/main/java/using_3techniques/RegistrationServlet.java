package using_3techniques;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		UserBean ub=new UserBean();
		ub.setUname(req.getParameter("uname"));
		ub.setPswd(req.getParameter("pswd"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setAddr(req.getParameter("addr"));
		ub.setMid(req.getParameter("mid"));
		ub.setPhno(Long.parseLong(req.getParameter("phno")));
		int k=new RegistrationDAO().addCustomer(ub);
		if(k>0) {
			req.setAttribute("msg", "Registration Successfull");
			req.getRequestDispatcher("register.jsp").forward(req, res);
		}else {
			res.getWriter().println("Registration Unsuccessful");
		}
	}

}
