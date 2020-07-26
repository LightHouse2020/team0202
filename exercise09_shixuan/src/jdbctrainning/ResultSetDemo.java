package jdbctrainning;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.ConnectionUtil;

public class ResultSetDemo {
	public static void main(String[] args) throws SQLException {
		query();
	}

	static void query() throws SQLException {
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from student");){
			    while (rs.next()) {
			    	Student student = new Student();
			    	student.setId(rs.getInt("id"));
			    }
			    } catch (SQLException e) {
			    	e.printStackTrace();
			    }

	}
}
