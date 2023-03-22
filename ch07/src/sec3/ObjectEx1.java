package sec3;

public class ObjectEx1 {

	public static void main(String[] args) {
		fnc0();
		
		Parents p1 = new Parents();
		p1.setLastName("손");
		p1.setFirstName("승기");
		p1.setAge(26);
		fnc1(p1);
		
		Parents p2 = fnc2();
		System.out.println(p2.getLastName()+p2.getFirstName(),p2.getAge());
		
		Parents pt = new Parents(); //전송할 데이터
		pt.setLastName("홍");
		pt.setFirstName("길동");
		pt.setAge(30);
		Parents p3 = fnc3(pt);
		System.out.println(p3.getLastName()+p3.getFirstName()+p3.getAge());
		
	}
	public static void fnc1(Parents p){
		
	}
	public static void fnc2(){
		
	}
	public static void fnc3(){
		
	}
}
