package sec1;

public class AbstractEx1 {

	public static void main(String[] args) {
		//추상 클래스는 추상화 되어 있어 구현할 내용이 없으므로 객체를 생성 할 수 없음
		//Abstract1 ab1 = new Abstract1();
		//추상 클래스로부터
		Abstract1 ab1 = new Abstract1(){
			@Override
			public String method1(){
				return "익명 클래스의 메소드1";
			}
		};
		ab1.method1();
		method2(); //메소드를 호출하면, 추상 클래스를 이용한 객체
	}
	static void method2(){ //익명의 클래스를 만들기 위한 메소드
		Abstract1 ab1 = new Abstract1(){
		@Override
		public String method1(){
			return "익명 클래스의 메소드1";
			}
		};
		ab1.method1();
	}
	static void method3(Abstract1 ab1){ //익명의 클래스를 매개변수로 대입하기 위한 메소드
		ab1.method1();
	}
}
