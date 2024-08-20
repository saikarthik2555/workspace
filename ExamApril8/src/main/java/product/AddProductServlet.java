package product;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/addd")
public class AddProductServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ProductBeann pb=new ProductBeann();
		pb.setId(Integer.parseInt(req.getParameter("id")));
		pb.setName(req.getParameter(req.getParameter("name")));
		pb.setPrice(Integer.parseInt(req.getParameter("price")));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));
		
		int k=new AddProductDAO().insert(pb);
		if(k>0) {
			req.setAttribute("msg","Product Added Successfully");
			req.getRequestDispatcher("addedproduct.jsp").forward(req, res);
		}
		
	}

}
