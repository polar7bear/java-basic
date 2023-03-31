package sec6;

import java.util.regex.Pattern;

public class RegEx1 {
	//정규표현식
	public static void main(String[] args) {
		String pattern = "^[0-9]*$"; //숫자만
		String val = "a123456789";   //대상문자열
		
		boolean regex = Pattern.matches(pattern, val);
		System.out.println(regex);
		
		String name = "손승기";
		String tel = "010-1234-5678";
		String email = "sons1998@naver.com";
		
		//유효성 검사
		boolean name_check = Pattern.matches("^[가-힣]*$", name);
		boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}", tel);
		boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);

		//출력
		System.out.println("이름 : "+name_check);
		System.out.println("전화번호 : "+tel_check);
		System.out.println("이메일 : "+email_check);
	}

}
