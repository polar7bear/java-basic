package sec2;

public class Example2 {

	public static void main(String[] args) {
		// 자동 형 변환
		byte a = 10;
		short b = a;
		int c = a;
		float d = c;
		long e = (long) d;  // 강제 형 변환 (long) < 형 변환 연산자
		double f = e;
		System.out.println(e);
		System.out.println(d);
		System.out.println(f);

	}

}
