package sec1;

public class Example5 {

	public static void main(String[] args) {
		short a = 12345;
		short b = 23456;
		short c = 31111;
		short d = 30000;
		short e = 20000;
		byte f = 127;
		Short g = b;
		Byte h = f;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("b 자료형 : "+ g.getClass().getName());
		System.out.println("f 자료형 : "+ h.getClass().getName());
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("a 메모리 주소 : "+System.identityHashCode(a));
	}

}
