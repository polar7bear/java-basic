package sec1;

public class Example9 {

	public static void main(String[] args) {
		float a = 1234.1234f;
		float b = -1234.1234f;
		float c = 0.1234567f;
		float d = -0.1234567f;
		float e = 0x1afcF;
		Float f = b;
		Float g = c;
		Float h = e;
		
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("float의 범위 : "+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("float의 바이트 수 : "+Float.BYTES);
		System.out.println("b의 자료형 타입 : "+f.getClass().getName());
		System.out.println("c의 자료형 타입 : "+g.getClass().getName());
		System.out.println("e의 자료형 타입 : "+h.getClass().getName());
	
	}

}
