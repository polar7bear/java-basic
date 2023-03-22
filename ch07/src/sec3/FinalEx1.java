package sec3;

public class FinalEx1 {

	public static void main(String[] args) {
		Parents m1 = new Parents();
		m1.getParents();
		m1.getParents2();
		System.out.println();
		
		m1 = new Child();
		m1.getParents();
		m1.getParents2();
		//Child는 final 클래스이므로 형 변환된 경우 멤버 필드 값을 추가 할 수 없음.
		System.out.println();
		
		m1 = new Descendant();
		m1.getParents();
		m1.getParents2();
		//Descendant는 자식 클래스이므로 부모 클래스로 선언된 멤버는 자식 멤버를 접근 할 수 없음.
		//m1.setRoot(); //원본 불변의 법칙
		
		Descendant m2 = new Descendant();
		m2.setRoot("손");
		

	}

}
