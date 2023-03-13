package sec1;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		int cs = 75;
		int ex = 90;
		int db = 85;
		int tot = cs+ex+db;
		float avg = (cs+ex+db) / 3.0f;
		String hak = "";
		//컴퓨터일반, 스프레드시트일반, 데이터베이스일반 점수를 변수로 입력받아 총점과 평균을 계산한 후
		//평균이 96~100 A+, 93~95 A0, 90~92 A-
		//평균이 86~89 B+, 83~85 B0, 80~82 B-
		//평균이 76~79 C+, 73~75 C0, 70~72 C-
		//평균이 66~69 B+,63~65 B0, 60~62 D-
		//평균이 60미만이면 F
		//로 학점을 계산
		
		//hak 을 계산
		//평균의 나머지를 정수로 바꾸어 +, 0, -를 hak 추가
		if(avg>=90){
			hak = "A";
		}else if(avg>=80){
			hak = "B";
		}else if(avg>=70){
			hak = "C";
		}else if(avg>=60){
			hak = "D";
		}
		
		if(avg % 10 >= 6){
			hak = hak + "+";
		}else if(avg % 10 >= 3){
			hak = hak + "0";
		}else{
			hak = hak + "-";
		}
		if(avg == 100) hak = hak + "+";
		
		if(avg < 60) hak = "F";
		
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+hak);
		
	
	}

}
