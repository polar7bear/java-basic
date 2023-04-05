package sec3;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {

	public static void main(String[] args) {
		Properties pro1 = new Properties();
		try {
			pro1.load(PropertiesEx2.class.getResourceAsStream("db.properties"));
			pro1.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
			System.out.println("드라이버 : " + pro1.getProperty("driver"));
			System.out.println("URL : " + pro1.getProperty("url"));
			System.out.println("사용자 아이디 : " + pro1.getProperty("username"));
			System.out.println("사용자 비밀번호 : " + pro1.getProperty("password"));
			
		} catch(IOException e){
			System.out.println("db.properties 파일을 찾지 못했습니다.");
			e.printStackTrace();
		}

	}

}
