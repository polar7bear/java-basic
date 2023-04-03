package sec1;

public class GenericEx1 {

	public static void main(String[] args) {
		Generic<User> u1 = new Generic<User>();
		
		User obj1 = new User();
		obj1.setUname("손승기");
		obj1.setUno(1);
		obj1.setUid("ABCD");
		
		u1.obj = obj1;
		
		Generic<Administrator> a1 = new Generic<Administrator>();
		Administrator obj2 = new Administrator();
		
		obj2.setGrade("admin");
		obj2.setAno(2);
		obj2.setName("관리자");
		
		a1.obj = obj2;
		
		System.out.println(u1.obj.toString());
		System.out.println(a1.obj.toString());
		

	}

}
