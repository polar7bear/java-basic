package sec3;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {
		Weekday today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 달력에서 요일번호 가져오기
		
		switch(week){
		case 1:
			today = Weekday.SUNDAY; break;
		case 2:
			today = Weekday.MONDAY; break;
		case 3:
			today = Weekday.TUESDAY; break;
		case 4:
			today = Weekday.WEDNESDAY; break;
		case 5:
			today = Weekday.THURSDAY; break;
		case 6:
			today = Weekday.FRIDAY; break;
		case 7:
			today = Weekday.SATURDAY; break;
			
		}
		if(today == Weekday.FRIDAY){
			System.out.println("금요일");
		}else{
			System.out.println("공부");
		}
		
	}

}
