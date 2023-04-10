package sec1;

import java.sql.*;

public class MySQLEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		Test2 upd = new Test2();
		upd.setId("cole");
		upd.setPw("3333");
		upd.setName("정형돈");
		String sql = "update test2 set pw=?, name=? where id=?";
		conn = MySQL.getConnection();
		int a = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, upd.getPw());
			pstmt.setString(2, upd.getName());
			pstmt.setString(3, upd.getId());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("회원정보 수정이 완료 되었습니다.");
			}else {
				System.out.println("회원정보 수정이 실패하였습니다.");
			}
		} catch (SQLException e) {
			System.out.println("회원정보 수정도중 오류가 발생하였습니다.");
		}

	}

}
