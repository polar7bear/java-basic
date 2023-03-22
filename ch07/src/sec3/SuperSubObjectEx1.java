package sec3;
import sec2.*;
public class SuperSubObjectEx1 {

	public static void main(String[] args) {
		//객체 선언
		Customer cus;
		cus = new Customer();
		cus.setName("손승기");
		fnc1(cus);
		cus = new Member();
		cus.setName("고길동");
		fnc1(cus);
		cus= new NonMember();
		cus.setName("홍길동");
		fnc1(cus);
	}
	public static void fnc1(Customer cus1){
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
	public static void fnc1(Member cus1){
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
	public static void fnc1(NonMember cus1){
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
}
