package sec2;

public class CustomEx1 {

	public static void main(String[] args) {
		Customer cus1 = new Customer();
		Member mem1 = new Member();
		NonMember non1 = new NonMember();
		
		cus1.setName("김철수");
		mem1.setName("박기영");
		non1.setName("박기철");
		
		System.out.println(cus1.getName());
		cus1.getCustom();
		System.out.println(mem1.getName());
		mem1.getCustom();
		System.out.println(non1.getName());
		non1.getCustom();

	}

}
