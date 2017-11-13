package cl.demo.thread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<>();
	
	public Connection getConnection() throws SQLException {
		Connection con = connectionHolder.get();
		if (con == null) {
			con = DriverManager.getConnection("");
			connectionHolder.set(con);
		}
		return con;
	}
	
}
