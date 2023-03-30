package sec2;

public class BoardEx1 {

	public static void main(String[] args) {
		Board b1 = new Board();
		b1.setBno(1);
		b1.setContent("Hello");
		b1.setTitle("Hi");
		
		System.out.println(b1.getBno());
		System.out.println(b1.getContent());
		System.out.println(b1.getTitle());

	}

}
