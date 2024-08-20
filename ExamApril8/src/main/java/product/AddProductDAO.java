package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddProductDAO {
	public int k;
	public int insert(ProductBeann pb) {
		try {
			Connection con=DBConnection2.getCon();
			PreparedStatement ps=con.prepareStatement("INSERT INTO EXAMPRODUCT VALUES(?,?,?,?)");
			ps.setInt(1, pb.getId());
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
