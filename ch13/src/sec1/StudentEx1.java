package sec1;


public class StudentEx1 {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.field1 = "1004";
		
		/*Generic(범용) - 하나의 타입만 사용하는게 아니라 여러 타입 아무거나 모두 받아서
		 *저장하거나 처리할 수 있는 클래스나 인터페이스로 객체 생성시에 원하는 타입을 지정하여 활용
		 *
		 *클래스명<타입> 으로 선언되며, 타입은 다른 클래스이거나 열거형, Reference타입이어야 한다.*/
		GenStudent<Integer> st2 = new GenStudent<Integer>();
		st2.field1 = 1004;
		
		GenStudent<Float> st3 = new GenStudent<Float>();
		st3.field1 = 0.123f;
		
		GenStudent<Boolean> st4 = new GenStudent<Boolean>();
		st4.field1 = true;
		
	}

}
