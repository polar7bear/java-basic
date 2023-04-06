package sec1;

class MyFunction4{
	int add(int x, int y){ return x+y; }
	int sub(int x, int y){ return x-y; }
	int mul(int x, int y){ return x*y; }
	float div(int x, int y){ return (float)x/y; }
}

public class FunctionEx4 {

	public static void main(String[] args) {
		MyFunction4 fnc4 = new MyFunction4();
		int a = fnc4.add(300, 200);
		System.out.println("더한 결과 : "+a);
		int b = fnc4.sub(200, 120);
		System.out.println("뺀 결과 : "+b);
		int c = fnc4.mul(12, 40);
		System.out.println("곱한 결과 : "+c);
		float d = fnc4.div(300, 7);
		System.out.println("나눈 결과 : "+d);
		
		

	}

}
