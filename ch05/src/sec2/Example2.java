package sec2;

public class Example2 {

	public static void main(String[] args) {
		//문자열 길이
		String data = "김기태는 천사";
		int len = data.length();
		System.out.println("data의 글자수 : "+len);
		
		//문자열 변경
		data = "김기태는 천재 너는 멍청이";
		System.out.println("data : "+data);
		//문자열 일부를 변경
		data = data.replace("김기태", "나");				//.replace("","");
		System.out.println("data : "+data);
		
		String id = "981227-1234567";
		String year = id.substring(0, 2);
		String month = id.substring(2, 4);				//.substring(begin,end); begin은 포함, end는 비포함
		String day = id.substring(4, 6);
		
		System.out.println(year+"년 "+month+"일 "+day+"일");
		
		
		//특정문자의 위치 찾기
		int pos = id.indexOf("-");						//.indexOf();
		System.out.println("-의 위치는 "+pos+"입니다.");
		
		//문자열 분리
		String dates = "1998-12-27";
		String names = "김세종-김우주-손승기-황병준";
		//문자열의 배열로 분리 - 문자열에서 특정 구분자 (token)을 기준으로 또 다른 여러 문자열로 분리
		String[] date = dates.split("-");
		String[] name = names.split("-");
		//Array.length - 문자열 배열의 길이
		for(int i=0;i<date.length;i++){
			System.out.println(date[i]);
		}
		System.out.println();
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}
	}

}
