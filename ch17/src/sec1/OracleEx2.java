package sec1;

import java.sql.*;


public class OracleEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		String sql = "insert into tbl_member_202201 values (member_seq.nextval, ?, ?, ?, ?, ?, ?)";
		Member mem = new Member();
		mem.setNo("20003");
		mem.setName("손승기");
		mem.setPhone("01012345678");
		mem.setAddress("고양시 일산서구");
		mem.setRegdate("20220107");
		mem.setCtype("VIP");
		int a = 0;
		conn = OracleDbc.getConnection();	//연결된 객체
		
		//.executeQuery() 는 select문일때 사용하며 반환타입이 ResultSet임
		//.executeUpdate()는 insert, update, delete문일때 사용하며 반환타입이 int임
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getNo());
			pstmt.setString(2, mem.getName());
			pstmt.setString(3, mem.getPhone());
			pstmt.setString(4, mem.getAddress());
			pstmt.setString(5, mem.getRegdate());
			pstmt.setString(6, mem.getCtype());
			
			a = pstmt.executeUpdate();	//추가된 sql 명령을 실행
			if(a>0){
				System.out.println("회원가입이 성공적으로 수행되었습니다.");
			} else {
				System.out.println("회원가입이 실패했습니다.");
			}
			OracleDbc.close(conn, pstmt);
		} catch(Exception e) {
			System.out.println("sql이 정상적으로 실행되지 않았습니다.");
		}
		
		}

	}


