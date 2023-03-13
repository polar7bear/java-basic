package sec1;

public class Example1 {

	public static void main(String[] args) {

		int a = 100;
		int b = 140;

		int c = a + b;
		System.out.println("a+b : "+c);
		
		int d = a - b;
		System.out.println("a-b : "+d);
		
		int e = a * b;
		System.out.println("a*b : "+e);
		
		float f = (float) b / a;
		System.out.println("b/a : "+f);

		int g = b % a;
		System.out.println("b%a : "+g);
		
		int h = b / 0; //Infinity
		System.out.println("b/o : "+h);
		
		int i = '손'	/ b; //NaN (Not a Number)
		System.out.println("손/b : "+i);
		}

}
