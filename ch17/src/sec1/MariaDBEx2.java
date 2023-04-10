package sec1;

import java.sql.*;

public class MariaDBEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;	
	public static void main(String[] args) {
		String sql = "insert into course_tbl values(?, ?, ?, ?, ?, ?, ?)";
		Course cos = new Course();
		cos.setId("40002");
		cos.setName("모바일 운영체제");
		cos.setCredit(3);
		cos.setLecturer("3");
		cos.setWeek(4);
		cos.setStart(1400);
		cos.setEnd(1700);
		
		conn = MariaDB.getConnection();
		int a = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cos.getId());
			pstmt.setString(2, cos.getName());
			pstmt.setInt(3, cos.getCredit());
			pstmt.setString(4, cos.getLecturer());
			pstmt.setInt(5, cos.getWeek());
			pstmt.setInt(6, cos.getStart());
			pstmt.setInt(7, cos.getEnd());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("회원가입이 완료 되었습니다.");
			} else {
				System.out.println("회원가입이 실패 하였습니다.");
			}
		} catch (SQLException e) {
			System.out.println("회원가입도중 오류가 발생하였습니다.");
		}

	}

}
