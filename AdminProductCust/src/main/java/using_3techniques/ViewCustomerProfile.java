package using_3techniques;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/viewcustomerprofile")
public class ViewCustomerProfile extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs=req.getSession();
		
		UserBean ub=(UserBean)hs.getAttribute("ubean");
		String uname=ub.getUname();
		String pswd=ub.getPswd();
		UserBean ub1=new CustomerDAO().check(uname,pswd);
			if(ub1==null) {
				req.setAttribute("msg", "Invalid UserName or Password");
				req.getRequestDispatcher("msg.jsp").forward(req, res);
			}else {
				req.getRequestDispatcher("viewcustomerprofile.jsp").forward(req, res);
			}
	}
}
