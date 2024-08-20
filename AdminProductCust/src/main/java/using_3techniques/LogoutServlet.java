package using_3techniques;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/logoutadmin")
public class LogoutServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		
		else {
		hs.removeAttribute("abean");
		hs.invalidate();						//session destroy
		req.setAttribute("msg", " Admin Logout Successfully");
		}
		req.getRequestDispatcher("msg.jsp").forward(req, res);
	}
}
