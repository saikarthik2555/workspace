package using_3techniques;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}else {
			String pcode=req.getParameter("pcode");
			Integer price=Integer.parseInt(req.getParameter("price"));
			Integer qty=Integer.parseInt(req.getParameter("qty"));
			
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)hs.getAttribute("alist");
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext()){
				ProductBean pb=(ProductBean)i.next();
				if(pb.getCode().equals(pcode)){
					pb.setPrice(price);
					pb.setQty(qty);
					int k=new UpdateDAO().update(pb);
					if(k>0) {
						req.setAttribute("msg", "Updated Successfully");
						req.getRequestDispatcher("update.jsp").forward(req, res);
					}else {
					PrintWriter pw=	res.getWriter();
					pw.println("Not showing, Not updated");
					}
			}break;
		}
	}
  }
}
