package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	public DAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver não encontrado");
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_teste", "root", "");
		return conn;
	}
}
