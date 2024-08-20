package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection2 {
	private static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final  String uname="C##MYJDBC";
	private static final String pwd="ORACLE";
	
	private DBConnection2() {
		
	}
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() throws SQLException {
		return DriverManager.getConnection(url,uname,pwd);
	}
	
}
