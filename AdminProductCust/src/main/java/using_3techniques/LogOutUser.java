package using_3techniques;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/logoutuser")
public class LogOutUser extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		HttpSession hs=req.getSession();
		hs.removeAttribute("ubean");
		hs.invalidate();
		
			req.setAttribute("msg", "User Logout Sucessfully");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
	}

}
