package using_3techniques;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/product")
public class ProductServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
	
		}else{
		ProductBean pb=new ProductBean();
		pb.setCode(req.getParameter("code"));
		pb.setName(req.getParameter("name"));
		pb.setPrice(Integer.parseInt(req.getParameter("price")));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));
		int k=new ProductDAO().insert(pb);
		if(k>0) {
			req.setAttribute("msg", "Product Details Successfully Inserted");
			req.getRequestDispatcher("product.jsp").forward(req, res);
			
		}else {
			req.setAttribute("msg", "Product Details Not Inserted ");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
	 }
  }
}
