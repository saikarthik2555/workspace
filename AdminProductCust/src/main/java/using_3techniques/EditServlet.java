package using_3techniques;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
			HttpSession hs=req.getSession();
			if(hs==null) {
				req.setAttribute("msg", "Session Expired");
				req.getRequestDispatcher("msg.jsp").forward(req, res);
			}else {
				String pcode=req.getParameter("pcode");
				ArrayList<ProductBean> al=(ArrayList<ProductBean>)hs.getAttribute("alist");
				Iterator<ProductBean> i=al.iterator();
				while(i.hasNext()){
					ProductBean pb=(ProductBean)i.next();
					if(pb.getCode().equals(pcode)){
						req.setAttribute("pbean", pb);
						//send particular product
						req.getRequestDispatcher("edit.jsp").forward(req, res); 
						break;
					}
				}
		
			}
	}

}
