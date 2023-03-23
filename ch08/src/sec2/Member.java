package sec2;

public class Member implements User {
	/*클래스로부터 상속받을 경우 extends, 인터페이스로부터 상속받을 경우 implements
	 *상속관계 - 클래스 -> 클래스 , 인터페이스 -> 인터페이스 extends
	 *인터페이스 -> 클래스 implements
	 *인터페이스는 상식적으로 클래스로부터 상속을 받을수가 없음
	 *다중 상속 : 여러 인터페이스로부터 상속 받은 인터페이스 */
	

	@Override
	public String method1() {
		return "회원";
	}

	@Override
	public int method2() {
		return 2;
	}
	
}
