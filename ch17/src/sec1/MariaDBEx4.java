package sec1;

import java.sql.*;

public class MariaDBEx4 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Course c = new Course();
		c.setId("40002");
		int a = 0;
		String sql = "delete from course_tbl where id=?";
		
		conn = MariaDB.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getId());
			
			a = pstmt.executeUpdate();
			
			if(a>0){
				System.out.println("회원탈퇴가 완료 되었습니다.");
			} else {
				System.out.println("회원탈퇴가 실패 하였습니다.");
			}
			MariaDB.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("쿼리가 정상적으로 작동하지 않았습니다.");
		}

	}

}
