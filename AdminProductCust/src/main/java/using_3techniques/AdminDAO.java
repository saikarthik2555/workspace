package using_3techniques;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {
	public AdminBean ab=null;
	public AdminBean login(String uname,String pswd) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM ADMIN WHERE UNAME=? AND PASSWORD=?");
			ps.setString(1, uname);
			ps.setString(2, pswd);
			ResultSet rs=ps.executeQuery();
			ab=new AdminBean();
			if(rs.next()) {
			ab.setUname(rs.getString(1));
			ab.setPswd(rs.getString(2));
			ab.setFname(rs.getString(3));
			ab.setLname(rs.getString(4));
			ab.setAddr(rs.getString(5));
			ab.setMid(rs.getString(6));
			ab.setPhno(rs.getLong(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ab;
	}
}
