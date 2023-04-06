package sec1;

@FunctionalInterface
interface MyFnc2 {
	int fnc2();
}

public class LambdaEx2 {
	public LambdaEx2() {
		MyFnc2 f1 = () -> { return 1004; };
		System.out.println("결과 : "+f1.fnc2());
		MyFnc2 f2 = () -> { return 1000; };
		System.out.println("결과 : "+f2.fnc2());
	}
	public static void main(String[] args){
		new LambdaEx2();
	}
}
