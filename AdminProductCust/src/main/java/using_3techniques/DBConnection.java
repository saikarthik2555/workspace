package using_3techniques;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String userName="C##MYJDBC";
	private static String password="ORACLE";
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() throws SQLException {
		return DriverManager.getConnection(url,userName,password);
	}
}
