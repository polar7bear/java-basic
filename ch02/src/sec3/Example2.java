package sec3;

public class Example2 {

	public static void main(String[] args) {
		// 정수, 문자열, 실수 지시자 세부적으로 출력 지시(제어)
		int a = 1234;
		double b = 1234.5678d;
		
		
		System.out.printf("%d\n",a); //%d에 a가 대입
		System.out.printf("%10d\n",a); //앞에 10칸의 공백이 생기고 d자리에 a대입
		System.out.printf("%-10d\n",a); //d자리에 a가 대입되고 그 뒤에 10칸의 공백 생김.
		System.out.printf("%010d\n",a); //전체 10자리 출력, 0으로 채워지고 d자리에 a가 대입
		
		System.out.printf("%f",b); //%f자리에 실수 타입의 변수인 f의 값이 대입
		System.out.printf("%15f\n",b); //숫자 15자리고 f자리에 f 실수 대입
		System.out.printf("%.8f\n",b); //소수점 이하 8자리까지 대입
		System.out.printf("%9.4f\n",b); //소수점 이하 4자리를 출력하고, 전체 9자리를 출력하고, 남은 자릿수 만큼 
		
		System.out.printf("%s\n",s); //%s에 String 타입의 변수인 s의 값 대입
		System.out.printf("%15s\n",s); //15자리로 출력하되, 왼쪽에 남은 자릿수만큼 공백
		System.out.printf("%-6s\n",s); //15자리로 출력하되, 오른쪽에 남은 자릿수만큼 공백
		
		

	}

}
