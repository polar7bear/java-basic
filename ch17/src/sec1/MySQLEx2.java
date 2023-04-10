package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		Test2 insert = new Test2();
		insert.setId("cole");
		insert.setPw("9999");
		insert.setName("정준하");
		String sql = "insert into test2 values(?, ?, ?)";
		conn = MySQL.getConnection();
		int a = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, insert.getId());
			pstmt.setString(2, insert.getPw());
			pstmt.setString(3, insert.getName());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("회원가입이 되었습니다.");
			}else {
				System.out.println("회원가입이 실패하였습니다.");
			}
		} catch (SQLException e) {
			System.out.println("회원가입도중 오류가 발생하였습니다.");
		}

	}

}
