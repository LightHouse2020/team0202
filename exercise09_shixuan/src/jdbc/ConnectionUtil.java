package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres","postgres", "123456");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}

