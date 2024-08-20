package details;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/details")
public class PersonalDetailsServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		long mobile=Long.parseLong(req.getParameter("mobile"));
		String gender=req.getParameter("gender");
		String hobbies=req.getParameter("hobbies");
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("Name - "+name+"<br>");
		pw.println("Age - "+age+"<br>");
		pw.println("Mobile - "+mobile+"<br>");
		pw.println("Gender - "+gender+"<br>");
		pw.println("Hobbies - "+hobbies+"<br>");
	}

}