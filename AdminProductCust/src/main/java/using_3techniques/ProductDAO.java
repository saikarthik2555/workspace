package using_3techniques;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
	ProductBean pb=null;
	public int k=0;
	public int insert(ProductBean pb) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("INSERT INTO ADMINPRODUCT values(?,?,?,?)");
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getName());
			ps.setInt(3, pb.getPrice());
			ps.setInt(4, pb.getQty());
			k=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return k;
	}
}
