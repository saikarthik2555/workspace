package using_3techniques;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewProductDAO {
	public ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean> getRecords(){
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM ADMINPRODUCT");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ProductBean pb=new ProductBean();
				pb.setCode(rs.getString(1));
				pb.setName(rs.getString(2));
				pb.setPrice(rs.getInt(3));
				pb.setQty(rs.getInt(4));
				al.add(pb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}

}
