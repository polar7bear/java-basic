package sec5;

import dao.Product;
import dao.Services;


public class ProductEx1 {

	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.name = "침대"; //접근제한이 public 이므로 다른패키지에서도 접근 가능
		//pro1.pid = "A001"; 접근 제한이 default이므로 같은 패키지에서만 접근 가능
		pro1.setPid("A001");
		//pro1.style = "BED"; 접근제한이 protected 일 경우 상속 관계나 포함 관계일때 접근이 가능
		pro1.setStyle("BED");
		//pro1.acount = 10; 접근제한이 private 일 경우는 현재 클래스에서만 접근 가능
		pro1.setAcount(10);
		
		Stuff sf1 = new Stuff();
		/*
		 * public : 클래스, 필드 , 생성자, 메소드 - 같은 패키지내이거나 다른 패키지에서도 import를 통하여 접근 가능
		 * protected : 필드, 생성자, 메소드 - 같은 패키지이거나 다른 패키지에서도 상속관게에 있는 클래스에서 접근 가능
		 * default : 클래스, 필드, 생성자, 메소드 - 같은 패키지일 때만 접근 가능
		 * private : 필드, 생성자, 메소드 - 같은 클래스 내에서만 접근이 가능하고 일반적으로는 public 타입의
		 * 
		 * public > protected > default > private
		 * */
		
		Services s1 = new Services();
		s1.name = "";
		s1.setStage();
		s1.setSid();
		
	}

}
