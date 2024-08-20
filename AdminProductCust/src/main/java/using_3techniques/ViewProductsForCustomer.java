package using_3techniques;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/viewproductsforcustomer")
public class ViewProductsForCustomer extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Invalid");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}else {
			ArrayList<ProductBean> al=new ViewProductDAO().getRecords();
			hs.setAttribute("alist", al);
			req.getRequestDispatcher("viewcustomerproducts.jsp").forward(req, res);
		}
	}

}
