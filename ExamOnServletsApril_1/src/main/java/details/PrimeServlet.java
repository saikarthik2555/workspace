package details;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/pi")
public class PrimeServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int ans=Integer.parseInt(req.getParameter("vali"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String result="Prime";
		for(int i=2;i<=ans/2;++i) {
			if(ans%i==0) {
				result="Not Prime"; break;
			}
		}
		pw.println("The Number "+ans+" Is "+""+result); 
	}

}
