package sec3;

public class MeberEx1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		
		mem1.setId("asd");
		mem1.setPw("1234");
		mem1.setName("김기철");
		mem1.setTel("010-1234-5678");
		mem1.setEmail("asd@naver.com");
		
		mem2 = mem1;
		
		mem3.setId("zxc");
		mem3.setPw("5678");
		mem3.setName("이철수");
		mem3.setTel("010-9876-5432");
		mem3.setEmail("zxc@naver.com");
		
		System.out.println(mem1);
		System.out.println(mem2);
		System.out.println(mem3);
	}

}
