package sec2;

public class Example6 {

	public static void main(String[] args) {
		//10진수를 n진수로 변환
		int a = 346479;
		System.out.println("2진수로 변환 : "+Integer.toBinaryString(a));
		System.out.println("8진수로 변환 : "+Integer.toOctalString(a));
		System.out.println("16진수로 변환 : "+Integer.toHexString(a));
		
		int b = 0b1010101;
		int c = 0176574;
		int d = 0xFE13A;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		
		
		
		
	}

}
