package sec1;


public class LambdaEx4 {
@FunctionalInterface
	public interface MyFnc4{
		int getCalc(int n1, int n2);
	}
	public static void main(String[] args) {
		MyFnc4 add = (x, y) -> { return x+y; };
		MyFnc4 sub = (x, y) -> { return x-y; };
		MyFnc4 mul = (x, y) -> { return x*y; };
		MyFnc4 div = (x, y) -> { return x/y; };
		
		System.out.println("덧셈 : "+add.getCalc(100, 230));
		System.out.println("뺄셈 : "+sub.getCalc(80, 15));
		System.out.println("곱셈 : "+mul.getCalc(90, 2));
		System.out.println("나눗셈 : "+div.getCalc(90, 30));
	}

}
