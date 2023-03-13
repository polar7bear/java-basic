package sec1;

public class Example6 {

	public static void main(String[] args) {
		int a = 123456;
		int b = 'k';
		int c = -12345;
		int d = 0;
		Integer e = a;
		Integer f = c;
		
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("integer의 표현범위 : "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("a 메모리 주소 : "+System.identityHashCode(a));
		System.out.println("a의 자료형 : "+e.getClass().getName());
		System.out.println("c의 자료형 : "+f.getClass().getName());
	}

}
