package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewProductDetailsDAO {
	ArrayList<ProductBeann> al=new ArrayList<>();
	ProductBeann pb=new ProductBeann();
	public ArrayList<ProductBeann> getDetails(){
		try {
			Connection con=DBConnection2.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM EXAMPRODUCT");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			pb.setId(rs.getInt(1));
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
