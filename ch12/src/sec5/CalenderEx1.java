package sec5;

import java.util.Calendar;

public class CalenderEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year1 = cal.get(Calendar.YEAR);
		int month1 = cal.get(Calendar.MONTH)+1;
		int month2 = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int amPm = cal.get(Calendar.AM_PM);
		
		int hour1 = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String strWeek = null;
		
		switch(week){
			case Calendar.MONDAY: 	strWeek = "월"; break;
			case Calendar.TUESDAY: 	strWeek = "화"; break;
			case Calendar.WEDNESDAY:strWeek = "수"; break;
			case Calendar.THURSDAY: strWeek = "목"; break;
			case Calendar.FRIDAY: 	strWeek = "금"; break;
			case Calendar.SATURDAY: strWeek = "토"; break;
			default:				strWeek = "일";
		}
		
		String strAmPm = null;
		if(amPm == Calendar.AM){
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		/*
		 * if(hour1>=12) {System.out.println("오후 "+(hour1 - 12)+"시"); }
		 * else { System.out.println("오전 "+hour1+"시"); }
		 * */
		System.out.print(year1+"년 ");
		System.out.print(month1+"월 ");
		System.out.println(month2+"일");
		System.out.print(strWeek+"요일 ");
		System.out.println(strAmPm+" ");
		System.out.print(hour1+"시 ");
		System.out.print(minute+"분 ");
		System.out.println(second+"초");
	
		

	}

}
