package jdbctrainning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConnectionUtil;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException {

		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stmt =conn
				.prepareStatement("insert into student(id,Sname,sex,age) values(?,?,?,?)");
		        stmt.setInt(1, 64);
		        stmt.setString(2, "xiaowang");
		        stmt.setNString(3, "M");
		        stmt.setInt(4, 64);
		        stmt.execute();



	}

}
