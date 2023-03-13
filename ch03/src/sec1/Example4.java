package sec1;

public class Example4 {

	public static void main(String[] args) {
		//비교 연산자 ==, !=, >, >=, <, <=
		// 연산 결과는 true 혹은 false 로 출력
		int a = 5;
		int b = 2;
		System.out.println("a==b : "+(a==b));
		System.out.println("a!=b : "+(a!=b));
		System.out.println("a>b : "+(a>b));
		System.out.println("a>=b : "+(a>=b));
		System.out.println("a<b : "+(a<b));
		System.out.println("a<=b : "+(a<=b));
		
		String c = "손승기";
		String d = "손승기"; //String은 객체의 문자열 비교시에는 반드시 equals() 메서드 활용
		System.out.println("c==d : "+(c==d)); //자연비교
		System.out.println("c--d : "+(c.equals(d))); //실제비교 ★★★ 매우중요
		
		
	}

}
