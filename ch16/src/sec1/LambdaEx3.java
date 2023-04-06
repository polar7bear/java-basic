package sec1;

@FunctionalInterface
interface MyFnc3 {
	void fnc3(int a);
}

public class LambdaEx3 {
	public LambdaEx3(){
		MyFnc3 f1 = (a) -> { System.out.println(a+"이 입력되었습니다."); };
		f1.fnc3(50);
		
		MyFnc3 f2 = (a) -> { System.out.println((a+1000)+"이 연산되었습니다."); };
		f2.fnc3(2000);
		
		MyFnc3 f3 = (a) -> {
			if(a>=80) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		};
		f3.fnc3(95);
	
	}


	public static void main(String[] args) {
		new LambdaEx3();
		
	}

}
