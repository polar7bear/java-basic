package sec1;

import java.sql.*;


public class OracleEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		String sql = "update tbl_member_202201 set phone=?, address=? where c_no=?";
		Member mem = new Member();
		mem.setNo("20003");
		mem.setPhone("01077777777");
		mem.setAddress("경기도 양주시");
		
		int a = 0;
		conn = OracleDbc.getConnection();	//연결된 객체
		
		//.executeQuery() 는 select문일때 사용하며 반환타입이 ResultSet임
		//.executeUpdate()는 insert, update, delete문일때 사용하며 반환타입이 int임
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getPhone());
			pstmt.setString(2, mem.getAddress());
			pstmt.setString(3, mem.getNo());
			
			a = pstmt.executeUpdate();	//추가된 sql 명령을 실행
			if(a>0){
				System.out.println("회원정보 수정이 완료되었습니다.");
			} else {
				System.out.println("회원정보 수정이 실패했습니다.");
			}
			OracleDbc.close(conn, pstmt);
		} catch(Exception e) {
			System.out.println("sql이 정상적으로 실행되지 않았습니다.");
		}
		
		}

	}


