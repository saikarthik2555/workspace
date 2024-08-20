package using_3techniques;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {
	public UserBean ub=null;
	public UserBean check(String uname,String pswd) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM ADMINCUSTOMER WHERE UNAME=? AND PSWD=?");
			ps.setString(1, uname);
			ps.setString(2, pswd);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				ub=new UserBean();
				ub.setUname(rs.getString(1));
				ub.setPswd(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setAddr(rs.getString(5));
				ub.setMid(rs.getString(6));
				ub.setPhno(rs.getLong(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ub;
	}

}
