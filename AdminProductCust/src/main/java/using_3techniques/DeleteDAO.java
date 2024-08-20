package using_3techniques;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDAO {
	public int k=0;
	public int delete(ProductBean pb) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("DELETE FROM ADMINPRODUCT WHERE CODE=?");
			ps.setString(1, pb.getCode());
			k=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return k;
	}

}
