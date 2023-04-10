package sec1;

import java.sql.*;

public interface Dbc {
	public Connection getConnection();
	public void close(Connection conn, PreparedStatement pstmt);
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs);
}
