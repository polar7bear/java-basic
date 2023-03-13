package sec1;

public class Example3 {

	public static void main(String[] args) {
		//부호 연산자 및 증감 연산자
		int a = 20;
		int b = 30;
		int c = a - b;
		c = -c; //부호 연산자 -
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		int d = 10;
		d = d*-1;
		System.out.println("d = "+d);
		d = d*-1;
		System.out.println("d ="+d);
		
		int e = 50;
		System.out.println("e = "+(--e));
		e = 50;
		System.out.println("e = "+(e--));		// e = e-1 전위 연산은 값에 1을 뺀 결과를 출력
		System.out.println("e = "+e);			// 후위연산은 e를 먼저 출력하고 그다음 출력시 -1을 한 결과가 출력
		
		e = 50;
		System.out.println("e = "+(++e));
		e = 50;
		System.out.println("e = "+(e++));
		System.out.println("e - "+e);
		
	}

}
