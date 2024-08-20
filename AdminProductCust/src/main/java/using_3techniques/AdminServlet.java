package using_3techniques;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/admin")
public class AdminServlet extends HttpServlet{
	public AdminDAO ab;
	@Override
	public void init(ServletConfig scf) {
	 ab=new AdminDAO();						//initialization process
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String pswd=req.getParameter("pswd");
		AdminBean a= ab.login(uname,pswd);
		if(a==null) {
			System.out.println("invlid username or password executed");
			req.setAttribute("msg", "Invalid UserName or Password");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}else {
			System.out.println("asmin.jsp executed");
//			HttpSession hs=req.getSession();			//Session cannot be traveled like Cookie
//			hs.setAttribute("abean", a);				//So cannot send to JSP
//			req.getRequestDispatcher("admin.jsp").forward(req, res);	//add to attribute
			
			HttpSession hs=req.getSession();
			System.out.println(a.getFname());
			System.out.println(a.toString());
			hs.setAttribute("abean", a);
			req.getRequestDispatcher("admin.jsp").forward(req, res);
		}
	}
}
