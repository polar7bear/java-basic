package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MaridDBEx1 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		String sql = "select * from course_tbl";
		
		conn = MariaDB.getConnection();
		
		List<Course> courseList = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Course course = new Course();
				course.setId(rs.getString("id"));
				course.setName(rs.getString("name"));
				course.setCredit(rs.getInt("credit"));
				course.setLecturer(rs.getString("lecturer"));
				course.setWeek(rs.getInt("week"));
				course.setStart(rs.getInt("start_hour"));
				course.setEnd(rs.getInt("end_end"));
				courseList.add(course);
			}
			MariaDB.close(conn, pstmt, rs);
		} catch (SQLException e) {
			System.out.println("테이블 조회 실패");
		}
		for(Course c : courseList){
			System.out.println(c.toString());
		}

	}

}
