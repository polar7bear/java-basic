package sec5;

public class MixEx1 {

	public static void main(String[] args) {
		Mix mix1 = new Mix();
		//필드의 접근
		mix1.field1 = 10;
		mix1.field2 = 20;
		mix1.field3 = 30;
		//mix1.field4 = 40; //private
		
		//메소드 호출
		mix1.method1();
		mix1.method2();
		mix1.method3();
		//mix1.method4(); // private

	}

}
