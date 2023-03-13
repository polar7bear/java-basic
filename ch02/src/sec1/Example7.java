package sec1;

public class Example7 {

	public static void main(String[] args) {
		long a = 100000000000l;
		long b = 12345678901234567l;
		Long c = a;
		Long d = b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("long의 범위 : "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("a의 메모리 주소 : "+System.identityHashCode(a));
		System.out.println("a의 자료형 타입 : "+c.getClass().getName());
		System.out.println("b의 자료형 타입 : "+d.getClass().getName());
	}

}
