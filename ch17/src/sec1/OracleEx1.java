package sec1;

import java.sql.*;
import java.util.ArrayList;


public class OracleEx1 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		String sql = "select * from tbl_member_202201";
		conn = OracleDbc.getConnection();	//연결된 객체
		//.executeQuery() 는 select문일때 사용하며 반환타입이 ResultSet임
		//.executeUpdate()는 insert, update, delete문일때 사용하며 반환타입이 int임
		ArrayList<Member> memList = new ArrayList<Member>();
		try {
			pstmt = conn.prepareStatement(sql);	//sql 명령을 추가
			rs = pstmt.executeQuery();	//추가된 sql 명령을 실행
			while(rs.next()) {	//다음 레코드가 있을때까지
				Member mem = new Member();
				mem.setSeq(rs.getInt("member_seq"));
				mem.setNo(rs.getString("c_no"));
				mem.setName(rs.getString("c_name"));
				mem.setPhone(rs.getString("phone"));
				mem.setAddress(rs.getString("address"));
				mem.setRegdate(rs.getString("regist_date"));
				mem.setCtype(rs.getString("c_type"));
				memList.add(mem);
			}
			OracleDbc.close(conn, pstmt, rs);
		} catch(Exception e) {
			System.out.println("sql이 정상적으로 실행되지 않았습니다.");
		}
		for(Member m : memList){
			System.out.println(m.toString());
		}

	}

}
