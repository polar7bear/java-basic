package sec4;

public class StringEx4 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("김기태");
		System.out.println(sb.toString());
		
		sb.append("~! 짱");
		System.out.println(sb.toString());
		
		sb.insert(0, "더조은");
		System.out.println(sb.toString());
		
		sb.delete(3, 6);
		System.out.println(sb.toString());
		
		System.out.println(sb.substring(0, 3));
		System.out.println(sb.length());
		

	}

}
