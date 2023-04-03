package sec1;


public class MemberEx1 {

	public static void main(String[] args) {
		Member<String, Integer> m1 = new Member<>();
		m1.setNo("자바");
		m1.setId(123);
		
		Member<Integer, String> m2 = new Member<>();
		
		m2.setNo(456);
		m2.setId("파이썬");
		
		m1.getNo();
		m1.getId();
		
		
		System.out.println(m1.getNo()+"\t"+m1.getId());
		System.out.println(m2.getNo()+"\t"+m2.getId());
		

	}

}
