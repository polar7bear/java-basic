package sec2;

public class Example5 {

	public static void main(String[] args) {
		String a ="true";
		String b ="false";
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println(Boolean.parseBoolean(a));
		System.out.println(Boolean.parseBoolean(b));
		
		System.out.println(Integer.parseInt(a)); // << 결함
	}	

}
