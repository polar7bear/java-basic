package sec1;

public class ExampleA {

	public static void main(String[] args) {
		double a = 123.456;       //double 에서 d를 안쓰면 float으로 간주
		double b = 123.456d;
		double c = 'Q';
		double d = 0237.123;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("double의 범위 : "+Double.MIN_VALUE+"~"+Double.MIN_VALUE);
		System.out.println("double 의 바이트 수 : "+Double.BYTES);
	}

}
