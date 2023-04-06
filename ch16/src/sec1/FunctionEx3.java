package sec1;

class MyFunction3{
	void method3(int x, int y){
		System.out.println("x+y = "+(x+y));
		System.out.println("x-y = "+(x-y));
		System.out.println("x*y = "+(x*y));
		System.out.println("x/y = "+(x/y));
	}
}

public class FunctionEx3 {

	public static void main(String[] args) {
		MyFunction3 fnc3 = new MyFunction3();
		fnc3.method3(70, 12);
		
	}

}
