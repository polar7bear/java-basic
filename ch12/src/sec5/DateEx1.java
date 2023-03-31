package sec5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		//DB에서는 날짜 데이터인데, 처리하는 자바 구문의 필드는 날짜로 받아왔다.
		//그러한 경우 문자열로 변호나하여야 원하는 날짜 표시형식으로 변경할 수 있다.
		
		//SimpleDateFormat 클래스로 문자열의 특정 날짜 표시형식을 만들어 출력
		Date today = new Date();
		System.out.println("오늘 날짜 : "+today);
		
		//자바 11이상에서는 반드시 날짜를 문자열로 변경해야함
		//String d = today.toString();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일"); 
		String y = sf.format(today);
		System.out.println(y);
		
		

	}

}
