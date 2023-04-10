package sec1;

import java.sql.*;

public class MariaDBEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Course c = new Course();
		c.setId("40002");
		c.setWeek(3);
		c.setStart(1500);
		c.setEnd(1800);
		
		int a = 0;
		String sql = "update course_tbl set week=?, start_hour=?, end_end=? where id=?";
		conn = MariaDB.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getWeek());
			pstmt.setInt(2, c.getStart());
			pstmt.setInt(3, c.getEnd());
			pstmt.setString(4, c.getId());
			
			a = pstmt.executeUpdate();
			
			if(a>0){
				System.out.println("회원정보 수정이 완료 되었습니다.");
			} else {
				System.out.println("회원정보 수정이 실패 하였습니다.");
			}
			MariaDB.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("쿼리가 정상적으로 작동하지 못했습니다.");
		}
		

	}

}
