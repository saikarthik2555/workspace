package details;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/facti")
public class FactorServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int ans=Integer.parseInt(req.getParameter("vali"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=ans;++i) {
			if(ans%i==0) {
				al.add(i);
			}
		}
		pw.println("The factors of the number "+ans+" are "+al);
	}
}
