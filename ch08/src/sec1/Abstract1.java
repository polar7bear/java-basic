package sec1;

public abstract class Abstract1 {
	//추상화 클래스 : 클래스를 만들 때 구체적인 내용을 기술하게 되면, 오히려 재사용성이 떨어짐
	//왜냐하면, 상위 클래스에서 미리 구체적으로 기술한다면 자식 클래스에서 더 많이 수정해야 하기때문
	//필드는 값을 설정하지 않고 메소드는 구현 내용을 미리 기술하지 않고 선언만 해야됨.
	//추상화 클래스는 메소드에서 일반 메소드일 경우는 그 구현할 내용을 기술해야 하고,
	//추상메소드일 경우는 선언만 하며,그 구현 내용은 자식 클래스에서 구현해야함.
	
	public String field1;
	public String field2;
	public abstract String method1();   //추상화 메소드 < 선언만
	public String method2(){	//일반화 메소드 < 구현내용 기술
		return "메소드2";
	}
}
