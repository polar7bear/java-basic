package sec4;

import java.util.Date;

public class Board {
	static String title = "여기는 제목";
	static String content = "여기는 내용";
	static String con;
	static Date resdate;
	static String author = "관리자";
	static String allData;
	
	static{		//정적블록
		con = title + content;
		allData = con + author;
	}
	public static void outputData(){	//정적 메소드
		System.out.println("title : "+title);
		System.out.println("content : "+content);
		System.out.println("resdate : "+resdate);
		System.out.println("author : "+author);
	}
}
