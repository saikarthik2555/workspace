package product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProductServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ArrayList<ProductBeann> al=new ViewProductDetailsDAO().getDetails();
		ProductBeann pb=al.get(4);
		PrintWriter pw=res.getWriter();

			pw.print(pb.getId()+" "+pb.getName()+" "+pb.getPrice()+" "+pb.getQty());
		
	}

}
