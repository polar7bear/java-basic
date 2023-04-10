package sec1;

import java.sql.*;

public class MariaDB {
	
	private final static String DRIVER = "org.mariadb.jdbc.Driver";
	private final static String URL = "jdbc:mariadb://127.0.0.1:3308/company";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			try {
				conn = DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException e) {
				System.out.println("DB 연결 실패");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
		return conn;
	}
	public static void close(Connection conn, PreparedStatement pstmt){
		try {
			pstmt.close();
			try {
				conn.close();
			} catch (Exception e){
				System.out.println("데이터베이스 종료 실패");
			}
		} catch (SQLException e) {
			System.out.println("데이터페이스 연결 끊기 실패");
		}
	}
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs){
		try {
			rs.close();
			try{
				pstmt.close();
				try{
					conn.close();
				} catch (Exception e) {
					System.out.println("데이터베이스를 닫지 못했습니다.");
				}
			} catch (Exception e){
				System.out.println("데이터베이스의 상태연결을 끊지못했습니다.");
			}
		} catch (SQLException e) {
			System.out.println("쿼리 종료 실패");
		}
	}
	
}
